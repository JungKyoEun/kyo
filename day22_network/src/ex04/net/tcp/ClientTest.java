package ex04.net.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest { // socket 1개 필요함(server IP, port)
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("221.141.152.124", 9000);
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			String str = "안녕~~~~";
			os.write(str.getBytes());

			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
