package ex03.net.tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr;
		addr = InetAddress.getLocalHost(); //����ó��
		System.out.println("���� ȣ��Ʈ �̸� : "+ addr.getHostName());
		System.out.println("���� ȣ��Ʈ IP�ּ� : "+ addr.getHostAddress());
		
		addr = InetAddress.getByName("www.google.com");
		System.out.println("Google ȣ��Ʈ �̸� : "+ addr.getHostName());
		System.out.println("Google ȣ��Ʈ IP�ּ� : "+ addr.getHostAddress());
		
		byte[] address = new byte[4];
		address[0] = (byte)61;
		address[1] = (byte)111;
		address[2] = (byte)62;
		address[3] = (byte)165;
		
		addr = InetAddress.getByAddress(address);
		System.out.println("Daum ȣ��Ʈ �̸� : "+ addr.getHostName());
		System.out.println("Daum ȣ��Ʈ IP�ּ� : "+ addr.getHostAddress());
		
		InetAddress[] arr;
		arr = InetAddress.getAllByName("www.kosta.or.kr");
		for(InetAddress kosta : arr){
			System.out.println("Kosta ȣ��Ʈ �̸� : "+ kosta.getHostName());
			System.out.println("Kosta ȣ��Ʈ �ּ� : " + kosta.getHostAddress());
		}
		
		InetAddress[] adr;
		adr = InetAddress.getAllByName("www.mju.ac.kr");
		for (InetAddress a : adr) {
			System.out.println("mju ȣ��Ʈ�̸� : "+ a.getHostName());
			System.out.println("mju ȣ��Ʈ�ּ� : "+ a.getHostAddress());
				
		}
	}
}
