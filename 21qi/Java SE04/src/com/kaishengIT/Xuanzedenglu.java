package com.kaishengIT;

public class Xuanzedenglu {

	public static void main(String[] args) {
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		while(true){
//			System.out.println("欢迎登陆管理系统");
//			System.out.println(   "1.登陆");
//			System.out.println(   "2.注册");
//			System.out.println(   "3.退出");
//			System.out.println("============");
//			System.out.print("请选择");
//			
//			int num = sc.nextInt();
//			
//			if(num == 1){
//				System.out.println("选择了登陆");
//			}else if(num == 2){
//				System.out.println("选择了注册");
//			}else if(num == 3){
//				System.out.println("退出成功");
//					break;
//			}else {
//				System.out.println("选择错误");
//			}
//		}
//		System.out.print("程序运行结束，正常关闭");
//		
	
	java.util.Scanner sc = new java.util.Scanner(System.in);
	while (true){
		System.out.println("欢迎登陆管理系统");
		System.out.println("   1.注册");
		System.out.println("   2.登陆");
		System.out.println("   3.退出");
		System.out.println("===========");
		System.out.print("请选择:");
		int num = sc.nextInt();
		if(num == 1){
			System.out.println("您选择了注册");
		}else if(num == 2){
			System.out.println("您选择了登陆");
		}else if(num == 3){
			System.out.println("退出成功");
			break;
		}else{
			System.out.println("选择错误");
		}
			
	
	}
	
	System.out.println("程序运行结束，正常关闭");
	
	
	
	}
	
}
				
			
			
			
