package ex05.net.tcp;

import java.io.*;
import java.net.*;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedReader stin = null;
		BufferedWriter bw = null;
		ServerSocket  ss = null;  //서버소켓
		Socket  s = null; // 클라이언트 소켓
		System.out.println("연결됨......나는 서버야....");
		
		try {
			ss = new ServerSocket(9999);
			s = ss.accept();
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 키보드로부터 입력 스트림
			stin = new BufferedReader(new InputStreamReader(System.in));
			// 클라이언트로의 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

			String inputMessage;
			while (true) {
				inputMessage = br.readLine();// 클라이언트에서 한행의 문자열 읽음
				// 클라이언트가 "Exit"를 보내면 연결 종료

				if (inputMessage.equalsIgnoreCase("exit"))
					break;

				System.out.println(inputMessage);// 클라이언트가 보낸 메세지 화면 출력

				String outputMessage = stin.readLine();// 키보드에서 한 행의 문자열 읽음
				// 키보드에서 읽은 문자열 전송
				bw.write("서버> " + outputMessage + "\n");
				bw.flush();
			}
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				s.close();
				ss.close();
			} catch (IOException e2) {
				System.out.println("클라이언트와 채팅 중 오류 발생....");
			}
		}
	}
}
