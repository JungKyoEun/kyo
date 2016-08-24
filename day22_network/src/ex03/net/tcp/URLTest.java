package ex03.net.tcp;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://www.oracle.com/us/products/networking/ethernet/quad-gbe-nic/overview/index.html");
		
		System.out.println("프로토콜 = " + url.getProtocol());
		System.out.println("호스트와 포트 = " + url.getAuthority());
		System.out.println("호스트 = " + url.getHost());
		System.out.println("포트 = " + url.getPort());
		System.out.println("경로 = " + url.getPath());
		System.out.println("질의 = " + url.getQuery());
		System.out.println("파일명 = " + url.getFile());
		System.out.println("참조 = " + url.getRef());
	}
}
