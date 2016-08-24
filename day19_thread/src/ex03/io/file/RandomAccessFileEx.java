package ex03.io.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		RandomAccessFile raf = new RandomAccessFile("sample.txt", "rw");  //예외처리....
		
		for( int i =0; i<= 10; i++) {
			raf.seek( i * 100 ); //예외처리... 내가 원하는 위치에 넣을 수 있다.
			raf.writeInt(i);
		}
		
		System.out.println("성공!!!!!");
		raf.close();
	}
}







