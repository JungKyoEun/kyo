package ex04.net.tcp;
import java.net.*;
import java.util.Date;
import java.io.*;

public class ServerTime {
	public static void main(String[] args) {
		int port = 7000;
		
		try {
			System.out.println("kyoeun start");
			ServerSocket ss = new ServerSocket(port);
			
			while(true){
				Socket client = ss.accept(); //socket2
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(new Date());
				oos.flush();
				client.close();
			}//while end
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
