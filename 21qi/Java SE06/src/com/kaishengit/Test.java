package com.kaishengit;

public class Test {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		String[] names = new String[10];
		String[] password = new String[names.length];
		while (true) {
			System.out.println("==��ӭ��½����ϵͳ==");
			System.out.println("     1.ע��");
			System.out.println("     2.��½");
			System.out.println("     3.�˳�");
			System.out.println("===============");
			System.out.print("��ѡ��");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("ѡ����ע��");

				System.out.print("�û���:");
				String regName = sc.next();
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null & regName.equals(names[i])) {
						System.out.println("���û����ظ���");
						break;
					}

					if (names[i] == null) {
						System.out.print("����:");
						String regPwd = sc.next();
						names[i] = regName;
						password[i] = regPwd;
						System.out.println("��ע��ɹ���");
						break;
					}
				}

			} else if (num == 2) {
				System.out.println("ѡ���˵�½");

				System.out.println("�û���:");
				String loginName = sc.next();
				System.out.println("����:");
				String loginPwd = sc.next();

				for (int i = 0; i < names.length; i++) {
					if (names[i] == null) {
						System.out.println("���û������������");
						break;
					}

					if (loginName.equals(names[i]) & loginPwd.equals(password[i])) {
						System.out.println("����½�ɹ���");
						break;
					}

				}

			} else if (num == 3) {
				System.out.println("ѡ�����˳�");
				break;
			} else {
				System.out.println("ѡ�����������ѡ��");
			}
		}

		System.out.println("�������н����������ر�");
	}
}
