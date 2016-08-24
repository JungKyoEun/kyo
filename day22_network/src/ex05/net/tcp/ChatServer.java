package ex05.net.tcp;

import java.io.*;
import java.net.*;

public class ChatServer {
	public static void main(String[] args) throws IOException {
		int port = 8000;
		ServerSocket ss = new ServerSocket(port); //server socket
		System.out.println("6조 채팅방 start !!!!");
		
		while(true) {
			Socket  s = ss.accept(); // client socket
			InputStream is = s.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			PrintStream ps = new PrintStream(System.out); //출력
			
			ps.print(s.getInetAddress().getHostAddress());
			String str = br.readLine();
			byte[] buffer = str.getBytes("euc-kr"); //한글 깨지지 않게 ~
			String msg = new String(buffer, "euc-kr");
			ps.print("  : 에서 수신 메세지 ===> " + msg+"\n");
			
			br.close();
			s.close();
		} // while end
	}
}







