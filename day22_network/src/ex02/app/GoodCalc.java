package ex02.app;

import ex02.lib.Calculator;

public class GoodCalc extends Calculator {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int substract(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public double average(int[] x) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum / x.length;
	}

}
