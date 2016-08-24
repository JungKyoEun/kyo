package ex02.lib;

public abstract class Calculator { //추상클래스
	public abstract int add(int x, int y); //두 수의 합을 구해서 리턴
	public abstract int substract(int x, int y); //두 수의 차를 구해서 리턴
	public abstract double average(int[] x); //배열에 저장된 정수의 평균을 구해서 실수형으로 리턴
}

