package ex01.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpMultiChatServer {
	HashMap  clients; //채팅프로그램에서 사용자 저장 변수 
	
	public TcpMultiChatServer() { //생성자함수
		clients = new HashMap(); // key, value
		Collections.synchronizedMap(clients); // 동기화작업
	}
	
	public void start() {
		ServerSocket ss = null;
		Socket s = null;
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 시작 되었습니다");
			
			while (true) {
				s = ss.accept(); //승인대기....클라이언트 무한으로 생길수 있음
				System.out.println("[" + s.getInetAddress() + " :" + s.getPort() + "] 에서 접속하였습니다");
				ServerReceiver thread = new ServerReceiver(s);  //user class
				thread.start();
			} // end while
		} catch (Exception e) {			e.printStackTrace();		}
	} //start() end
	
	public void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();
		
		while ( it.hasNext() ) {
			try {
				DataOutputStream dos = (DataOutputStream)clients.get(it.next());
				dos.writeUTF(msg);
			} catch (IOException e) {		e.printStackTrace();			}
		} // end while
	} // sendToAll(String msg) end
	
	class ServerReceiver extends Thread {  //inner class
		Socket s;
		DataInputStream dis;
		DataOutputStream dos; 
		
		public ServerReceiver(Socket s) {  //인자값 있는 생성자함수
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
				dos = new DataOutputStream(s.getOutputStream());
			} catch (Exception e) {	e.printStackTrace();		}
		} //constructor end
		
		public void run() {  //스레드 구현부(실행부)
			String name = "";
			try {
				name = dis.readUTF(); // 한글 입력해도 괜찮애
				sendToAll("#" + name + " 님이 입장하셨습니다.");
				
				clients.put(name, dos);
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다");
				
				while ( dis != null ) {
					sendToAll(dis.readUTF());
				}
			} catch (Exception e) {   e.printStackTrace();
			} finally {
				sendToAll("#" + name + " 님이 나가셨습니다.");
				clients.remove(name);
				System.out.println("[" + s.getInetAddress() + " : " + s.getPort() + "] 에서 접속 종료하였습니다." );
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다");
			}
		} //run() end
	} //ServerReceiver class end
	
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}
}
