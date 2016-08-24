package ex04.net.tcp;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest { //socket 2개 필요
	public static void main(String[] args) {
		ServerSocket socket = null;
		Socket clientSocket = null;
		System.out.println("Server Start !!! ");
		try{
			socket = new ServerSocket(9000);// 0~1024 포트 넘버는 약속된것임..
			clientSocket = socket.accept(); // client socket, 응답 대기
			InputStream input = clientSocket.getInputStream(); //read
			OutputStream output = clientSocket.getOutputStream(); //write
			
			byte[] arr = new byte[100];
			input.read(arr);
			System.out.println(new String(arr));
			String msg = "안녕...client!!";
			output.write(msg.getBytes());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				clientSocket.close(); socket.close();
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
	}
}
