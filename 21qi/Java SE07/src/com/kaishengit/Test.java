package com.kaishengit;

public class Test {

	public static void main (String[] args){
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		User user = new User();
		while (true){
			System.out.println("===================");
			System.out.println("     1.ע��");
			System.out.println("     2.��½");
			System.out.println("     3.�˳�");
			System.out.println("===================");
			System.out.println("��ѡ��");
			int num = sc.nextInt();
			if(num == 1){
				System.out.println("ѡ��ע��");
				System.out.print("�������û�����");
				user.name = sc.next();
				System.out.print("���������룺");
				user.password = sc.next();
				
				System.out.println("��ע��ɹ���");
			}else if(num == 2){
				System.out.println("ѡ���½");
				
				System.out.print("�������û�����");
				String loginName = sc.next();
				System.out.print("���������룺");
				String loginPwd = sc.next();
				
				boolean flag = false;
				
				if (loginName.equals(user.name) && loginPwd.equals(user.password)){
					flag = true;
				}
				if (flag){
					System.out.println("����½�ɹ���");
				}else {
					System.out.println("���û������������");
					
				}
				
					
			}else if(num == 3){
				System.out.println("ѡ���˳�");
				break;
			}else {
				System.out.println("ѡ�����������ѡ��");
			}
			
		}
		System.out.println("�������н����������ر�");
	}
}
