package p297;

import p296.Calculator;

public class Computer extends Calculator {
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer °´Ã¼ÀÇ areaCicle() ½ÇÇà");
		return Math.PI *r*r;
	}

}
