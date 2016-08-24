package ex04.thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId(); //getId는 시스템이 부여
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State state =Thread.currentThread().getState();
		
		System.out.println("현재 스레드 ID : " +id);
		System.out.println("현재 스레드 Name : " +id);
		System.out.println("현재 스레드 Priority : " +priority);
		System.out.println("현재 스레드 State : " +state
				);
		

	}

}
