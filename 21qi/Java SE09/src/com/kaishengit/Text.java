package com.kaishengit;

public class Text {
	
	public static double PI = 3.1415926;
	
	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("输入圆的半径");
		
		double radius = input.nextDouble();
		double a = radius * radius * PI;
		System.out.println("圆的面积为:" + a);
		
		
	
	}

}
