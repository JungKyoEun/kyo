package ex01.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	 
		Grade vo = new Grade();
		/*vo.setSubject("미술");
		vo.setScore(70);*/
		vo.setSubject("전산");
		vo.setScore(100);
		
		//System.out.println("before: "+vo);
		OutputStream os = new FileOutputStream("grade2.txt");//파일 출력 객체 생성
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(vo);
		///////////////////////////////////
		InputStream stream = new FileInputStream("grade.txt");//파일 입력 객체 생성
		ObjectInputStream ois = new ObjectInputStream(stream);
		
		Grade vo2 = (Grade)ois.readObject();
		System.out.println("after = "+vo2);
		oos.close(); ois.close();
	}

}

