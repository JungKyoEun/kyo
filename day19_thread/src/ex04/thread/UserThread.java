package ex04.thread;

public class UserThread extends Thread {
	

	String name;
	
	public UserThread(String name){ //�������Լ�
		this.name = name;
	}
	
	@Override
	public void run() { //������ �����(������)
		System.out.println(name);
		for (int i = 0; i <=10; i++) {
			if(i == 7){
				try{
				sleep(500); //1/1000 1��
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	
	}
}
