package com.kaishengit;

public class Test {

	public static void main (String[] args){
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		User user = new User();
		while (true){
			System.out.println("===================");
			System.out.println("     1.注册");
			System.out.println("     2.登陆");
			System.out.println("     3.退出");
			System.out.println("===================");
			System.out.println("请选择：");
			int num = sc.nextInt();
			if(num == 1){
				System.out.println("选择注册");
				System.out.print("请输入用户名：");
				user.name = sc.next();
				System.out.print("请输入密码：");
				user.password = sc.next();
				
				System.out.println("【注册成功】");
			}else if(num == 2){
				System.out.println("选择登陆");
				
				System.out.print("请输入用户名：");
				String loginName = sc.next();
				System.out.print("请输入密码：");
				String loginPwd = sc.next();
				
				boolean flag = false;
				
				if (loginName.equals(user.name) && loginPwd.equals(user.password)){
					flag = true;
				}
				if (flag){
					System.out.println("【登陆成功】");
				}else {
					System.out.println("【用户名或密码错误】");
					
				}
				
					
			}else if(num == 3){
				System.out.println("选择退出");
				break;
			}else {
				System.out.println("选择错误，请重新选择");
			}
			
		}
		System.out.println("程序运行结束，正常关闭");
	}
}
