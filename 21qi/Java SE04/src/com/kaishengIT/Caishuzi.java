package com.kaishengIT;

public class Caishuzi {

	public static void main(String[] args) {
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		int num = (5);
////		Math.random()*10 + 1 10以内的一个随机数
//		System.out.println("我心里有个数字，你猜下是几");
//		int count = 0;
//		
//		while(true){
//			count++;
//			System.out.print("请输入:");
//			int n = sc.nextInt();
//			if(n == num){
//				System.out.println("猜对了,次数" + count);
//			}else if (n > num){
//				System.out.println("大了");
//			}else if (n < num){
//				System.out.println("小了");
//			}
//		}
	
		
//	java.util.Scanner sc = new java.util.Scanner(System.in);
//	int num = (5);
//	System.out.println("我心里有个数字，你猜猜是几");
//	int count = 0;
//	
//	while(true){
//		count++;	
//		System.out.print("请输入数字:");
//		int n =sc.nextInt();
//	if(n == num){
//		System.out.println("猜对了:" + count + "次");
//	}else if(n >= num){
//		System.out.println("大了");
//	}else if(n <= num){
//		System.out.println("小了");
//	}
//	
//	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num = 8;
		System.out.println("我心里想了个数字，你猜猜是几");
		int count = 0;
		while (true){
			count++;
			System.out.print("请输入数字:");
			int n = sc.nextInt();
			if (n == num){
				System.out.println("猜对了第:" + count + "次");
			}else if(n >= num){
				System.out.println("大了");
			}else if(n <= num){
				System.out.println("小了");
			}
				
		}
	
	}
}
			
				

