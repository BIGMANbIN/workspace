package com.kaishengit;

public class Test {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		String[] names = new String[10];
		String[] password = new String[names.length];
		while (true) {
			System.out.println("==欢迎登陆管理系统==");
			System.out.println("     1.注册");
			System.out.println("     2.登陆");
			System.out.println("     3.退出");
			System.out.println("===============");
			System.out.print("请选择");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("选择了注册");

				System.out.print("用户名:");
				String regName = sc.next();
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null & regName.equals(names[i])) {
						System.out.println("【用户名重复】");
						break;
					}

					if (names[i] == null) {
						System.out.print("密码:");
						String regPwd = sc.next();
						names[i] = regName;
						password[i] = regPwd;
						System.out.println("【注册成功】");
						break;
					}
				}

			} else if (num == 2) {
				System.out.println("选择了登陆");

				System.out.println("用户名:");
				String loginName = sc.next();
				System.out.println("密码:");
				String loginPwd = sc.next();

				for (int i = 0; i < names.length; i++) {
					if (names[i] == null) {
						System.out.println("【用户名或密码错误】");
						break;
					}

					if (loginName.equals(names[i]) & loginPwd.equals(password[i])) {
						System.out.println("【登陆成功】");
						break;
					}

				}

			} else if (num == 3) {
				System.out.println("选择了退出");
				break;
			} else {
				System.out.println("选择错误，请重新选择");
			}
		}

		System.out.println("程序运行结束，正常关闭");
	}
}
