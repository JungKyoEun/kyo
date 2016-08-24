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
			System.out.println("-------------------ȸ�������Է��ϱ�--------------------");
			System.out.println("�̸� >> ");
			name = br.readLine();
			
			System.out.println("���̵� >> ");
		    id = br.readLine();
		    
		    System.out.println("��й�ȣ >> ");
		    pwd = br.readLine();
		    
		    System.out.println("���� >> ");
		    temp = br.readLine();
		    if(temp.equals("����")) gender = true;
		    else gender = false;
		    
		    System.out.println("���� >> ");
		    age = Integer.parseInt(br.readLine());
		    
		    System.out.println("����ó >> ");
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
