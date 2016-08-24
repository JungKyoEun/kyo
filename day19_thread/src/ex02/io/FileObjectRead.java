package ex02.io;

import java.io.*;

public class FileObjectRead {
	public static void main(String[] args) {
		String name = null;
		String id = null;
		String pwd = null;
		boolean gender = true;
		int age = 0;
		String phone = null;
		String temp = null;
		
		File f = new File("members2.txt");
		
		try{
		   FileInputStream fis = new FileInputStream(f);
		   ObjectInputStream ois = new ObjectInputStream(fis);
		   
		   name = (String)ois.readObject();
		   id = (String)ois.readObject();
		   pwd = (String)ois.readObject();
		   gender =(Boolean)ois.readObject();
		   age = (Integer)ois.readObject();
		   phone = (String)ois.readObject();
		   
		   ois.close();
		   System.out.println("\t\t=>> 회원정보 <<\n");
		   System.out.println("이름 \t 아이디 \t\t 비밀번호 \t  성별  \t  나이 \t 전화번호");
		   System.out.println(name + "\t" + id + "\t" + pwd +"\t");
		   if(gender == true) System.out.println("M");
		   else System.out.println("F");
		   
		   System.out.println("\t" + age +"\t" +phone);
		   
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
