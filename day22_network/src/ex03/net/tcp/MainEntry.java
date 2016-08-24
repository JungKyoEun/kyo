package ex03.net.tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainEntry {

	public static void main(String[] args) {
		String host = "127.0.0.1";
		try{
			InetAddress[] address = InetAddress.getAllByName(host);
			
			for(InetAddress item : address){
				System.out.println(item.getCanonicalHostName());
			}//end for
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
	}

}
