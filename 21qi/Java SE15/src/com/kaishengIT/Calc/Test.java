package com.kaishengIT.Calc;

public class Test {
	public static void main(String[] args){
	CalcFactory f = new CalcFactory();
	Calc Cheng = f.getCalc("+");
	
	int result = Cheng.cul(1, 2);
	System.out.println(result);
	
	
	}

}
