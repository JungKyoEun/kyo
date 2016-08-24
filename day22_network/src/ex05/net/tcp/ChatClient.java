package ex05.net.tcp;
import java.io.*;
import java.net.*;

public class ChatClient {
	public static void main(String[] args) throws IOException {
		int port = 8000;
		String ip, str;
		
		PrintStream ps = new PrintStream(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ps.print("접속할 서버 ip ===>  " );
		ip = br.readLine();  //예외처리
		while(true){
		ps.print("전송할 메세지 ===>  " );
		str = br.readLine();
		
		byte[] buffer = str.getBytes("euc-kr");
		String msg = new String(buffer, "euc-kr");
		
		Socket  client = new Socket(ip, port);
		OutputStream  os = client.getOutputStream();
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(os));
		
		bw.write(str, 0, msg.length());
		bw.flush();
		
		bw.close();
		//client.close();
		//ps.print(ip + " 에 메세지 전송 성공!!!");
		//ps.close();
		}
	}
}








