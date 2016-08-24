package ex04.thread;

public class UserRunnable implements Runnable {

	String name;
	
	public UserRunnable(String name){ //생성자함수
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name);
		for (int i = 0; i <=10; i++) {
			if(i == 7){
				try{
				Thread.sleep(500); //1/1000 1초
				System.out.println(name);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	
	}

}
