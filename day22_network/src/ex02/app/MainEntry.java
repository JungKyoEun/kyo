package ex02.app;

import ex02.lib.*;

public class MainEntry {

	public static void main(String[] args) {
		Calculator calc = new GoodCalc();
		
		System.out.println(calc.add(33, 5));
		System.out.println(calc.substract(33, 5));
		System.out.println(calc.average(new int[]{1,2,3}));

	}

}
