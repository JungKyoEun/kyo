package ex05.net.tcp;

import java.io.*;
import java.net.*;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedReader stin = null;
		BufferedWriter bw = null;
		Socket s = null;
		try {
			s = new Socket("localhost",9999);

			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			String outputMessage;
			while(true) {
				outputMessage = stin.readLine();
				
				if(outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				}
				
				//키보드에서 읽은 문자열 전송
				bw.write("클라이언트> "+
				outputMessage + "\n");
				bw.flush();
				
				String inputMessage = stin.readLine();
				System.out.println(inputMessage);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				s.close();
			} catch (IOException e2) {
				System.out.println("서버와 채팅 중 오류 발생....");
			}
		}
	}
}
