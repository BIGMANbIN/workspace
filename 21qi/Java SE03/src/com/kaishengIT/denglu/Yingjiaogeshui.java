package com.kaishengIT.denglu;

public class Yingjiaogeshui {

	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("工资金额:");
		int num = sc.nextInt();
		int num1 = 0;
		System.out.println("个人所得税金额为:" );
		num1 = num - 3500;
		if(num1<0){
			System.out.println(0);
		}else if (num1 < 1500){
			System.out.println("个人所得税金额为：" + num1 * 0.03);
			
		}else if (num1 < 4500){
			System.out.println(num1 * 0.1 - 105);
		}else if(num1 < 9000){
			System.out.println(num1 * 0.2 - 555);
		}else if(num1 < 35000){
			System.out.println(num1 * 0.25 - 1005);}
		else if (num1 < 55000){
			System.out.println(num1 * 0.3 - 2755);
		}else if (num1 < 80000){
			System.out.println(num1 * 0.35 - 5505);
		}else {
			System.out.println(num1 * 0.45 - 13505);
			
		}
		
	}
}
