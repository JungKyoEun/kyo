package ex04.thread;

public class ThreadEx extends Thread {
	String name ;
	
	public ThreadEx(String name){
		this.name = name;
	}
	
	public void run(){
		int  i = 0 ;
		while(true){
			System.out.println("thread name : "+name+"\t number : "+i++);
			if(i==10) break;
			
			try{
				sleep(5);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadEx t1 = new ThreadEx("제일 높은 스레드");
		ThreadEx t2 = new ThreadEx("보통 스레드");
		ThreadEx t3 = new ThreadEx("제일 낮은 스레드");
		
        t1.setPriority(Thread.MAX_PRIORITY); //10
        t2.setPriority(Thread.NORM_PRIORITY); //5
        t3.setPriority(Thread.MIN_PRIORITY); //1
        
        t3.start();
        t2.start();
        t1.start();
	}

}
