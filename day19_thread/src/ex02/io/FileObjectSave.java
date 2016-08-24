package ex02.io;
import java.io.*;

public class FileObjectSave {
	public static void main(String[] args) {
		String name = null;
		String id = null;
		String pwd = null;
		boolean gender = true;
		int age = 0;
		String phone = null;
		String temp = null;
		
		/*InputStream is = System.in;
		InputStreamReader reader = new InputStreamReader(is);
		BufferedReader bbr = new BufferedReader(reader);*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File f = new File("members2.txt");
		
		try{
			FileOutputStream fos = new FileOutputStream(f,true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println("-------------------회원정보입력하기--------------------");
			System.out.println("이름 >> ");
			name = br.readLine();
			
			System.out.println("아이디 >> ");
		    id = br.readLine();
		    
		    System.out.println("비밀번호 >> ");
		    pwd = br.readLine();
		    
		    System.out.println("성별 >> ");
		    temp = br.readLine();
		    if(temp.equals("남자")) gender = true;
		    else gender = false;
		    
		    System.out.println("나이 >> ");
		    age = Integer.parseInt(br.readLine());
		    
		    System.out.println("연락처 >> ");
		    phone = br.readLine();
		    
		    oos.writeObject(name);
		    oos.writeObject(id);
		    oos.writeObject(pwd);
		    oos.writeObject(gender);
		    oos.writeObject(age);
		    oos.writeObject(phone);
		    
		    System.out.println("members save!!!");
		    oos.close();
		    
		    
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
