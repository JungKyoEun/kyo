package ex04.thread;

public class UserThread extends Thread {
	

	String name;
	
	public UserThread(String name){ //생성자함수
		this.name = name;
	}
	
	@Override
	public void run() { //스레드 실행부(구현부)
		System.out.println(name);
		for (int i = 0; i <=10; i++) {
			if(i == 7){
				try{
				sleep(500); //1/1000 1초
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	
	}
}
