package ex03.net.tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr;
		addr = InetAddress.getLocalHost(); //예외처리
		System.out.println("로컬 호스트 이름 : "+ addr.getHostName());
		System.out.println("로컬 호스트 IP주소 : "+ addr.getHostAddress());
		
		addr = InetAddress.getByName("www.google.com");
		System.out.println("Google 호스트 이름 : "+ addr.getHostName());
		System.out.println("Google 호스트 IP주소 : "+ addr.getHostAddress());
		
		byte[] address = new byte[4];
		address[0] = (byte)61;
		address[1] = (byte)111;
		address[2] = (byte)62;
		address[3] = (byte)165;
		
		addr = InetAddress.getByAddress(address);
		System.out.println("Daum 호스트 이름 : "+ addr.getHostName());
		System.out.println("Daum 호스트 IP주소 : "+ addr.getHostAddress());
		
		InetAddress[] arr;
		arr = InetAddress.getAllByName("www.kosta.or.kr");
		for(InetAddress kosta : arr){
			System.out.println("Kosta 호스트 이름 : "+ kosta.getHostName());
			System.out.println("Kosta 호스트 주소 : " + kosta.getHostAddress());
		}
		
		InetAddress[] adr;
		adr = InetAddress.getAllByName("www.mju.ac.kr");
		for (InetAddress a : adr) {
			System.out.println("mju 호스트이름 : "+ a.getHostName());
			System.out.println("mju 호스트주소 : "+ a.getHostAddress());
				
		}
	}
}
