package com.kaishengIT;

public class Myutil {
	/**
	 * 
	 * 
	 * @param a
	 * @param b
	 * @return 0:平局 1: a获胜  2: b获胜
	 */
	public static int bijiao(int a, int b){
		if (a == b) {
			return 0;
	}	else if ((a == 1&& b == 2) || (a == 2&& b == 3) || (a == 3&& b == 1)) {
			return 1;
	
	}	else{
			return 2;
	}
		
	}
	public static String qStr(int n){
		return n == 0? "石头": n == 1? "剪刀": "布";
		
	}
	
	}
	
		
	