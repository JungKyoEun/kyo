package ex04.thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId(); //getId�� �ý����� �ο�
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State state =Thread.currentThread().getState();
		
		System.out.println("���� ������ ID : " +id);
		System.out.println("���� ������ Name : " +id);
		System.out.println("���� ������ Priority : " +priority);
		System.out.println("���� ������ State : " +state
				);
		

	}

}
