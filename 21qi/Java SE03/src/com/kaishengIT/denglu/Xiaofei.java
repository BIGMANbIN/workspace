package com.kaishengIT.denglu;

public class Xiaofei {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("请输入金额");
		int sum = sc.nextInt();
		
		if(sum < 2000){
			sum = (int) (sum * 0.9);
			
		}else if(sum >= 2000 && sum < 4000){
			sum = (int) (sum * 0.8);
		}else if(sum >= 4000 && sum < 5000){
			sum = (int) (sum * 0.7);
			
			}
		
		else {
			sum = (int) (sum * 0.6);
		}
		
		System.out.println("实际金额" + sum);
		
		
				
		
		
	
	
	}
	
	
	
}
