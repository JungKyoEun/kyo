package ex03.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {

	public static void main(String[] args) throws IOException {
		URL google = new URL("http://www.google.co.kr");// 예외 발생
		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
		String inputLine;
		
		while((inputLine = br.readLine()) != null){
			System.out.println(inputLine + "\r\n");
		}
		br.close();
	}

}
