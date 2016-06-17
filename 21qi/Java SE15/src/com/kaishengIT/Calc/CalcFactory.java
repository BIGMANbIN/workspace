package com.kaishengIT.Calc;

public class CalcFactory {
	public Calc getCalc(String str){
		Calc c = null;
		
		switch (str){
		case "+":
			c = new JiaCalc();
			break;
		case "-":
			c = new JianCalc();
			break;
		case "*":
			c = new ChengCalc();
			break;
		case "/":
			c = new Chu();
			break;
			
			
			
		}
		return c;
		
	}
	

}
