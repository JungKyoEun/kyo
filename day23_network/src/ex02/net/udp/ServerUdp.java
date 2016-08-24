package ex02.net.udp;

import java.io.*;
import java.net.*;

public class ServerUdp {
  public static void main(String[] args) {
	  DatagramPacket dp = null;
	  DatagramSocket ds = null;
	  DataInputStream dis = null;
	  BufferedReader br = null;
	  int port = 5000;
	  String str;
	  byte[] b;
	  
	  try {
		System.out.println("### File Client ###");
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���� ���( server ip ) =  ");
		String ipAddress = br.readLine();
		System.out.println("���� ����(���ϸ�.Ȯ����) = ");
		String fileName = br.readLine();
		
		File file = new File(fileName);
		
		if( !file.exists() ){
			System.out.println("������ �������� �ʽ��ϴ�.");
			System.exit(-1);
		}// if end
		
		ds = new DatagramSocket();
		InetAddress iaddress = InetAddress.getByName(ipAddress);
		str = "start";
		b = str.getBytes();
		
		dp = new DatagramPacket(b,b.length,iaddress,port);
		ds.send(dp); //�۽�
		
		dis = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(file)));
		b= new byte[65536];
		
		while(true){
			int count = dis.read(b,0,b.length); //����մ� ���� b�� 0~ b.length��ŭ �о�
			
			if(count == -1) break;
			
			dp = new DatagramPacket(b,count,iaddress, port);
			ds.send(dp);
			
			dp = new DatagramPacket(b,b.length,iaddress,port);
			ds.send(dp);
		}//while end
	} catch (Exception e) {
		e.printStackTrace();
	} finally{
		try {	br.close(); dis.close();	} catch (Exception e2) {e2.printStackTrace();}
	}
   }
}
