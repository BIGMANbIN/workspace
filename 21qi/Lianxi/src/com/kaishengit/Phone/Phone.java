package com.kaishengit.Phone;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import Contact.kaishengit.entity.Contact;

public class Phone {

	private Scanner sc = new Scanner(System.in);

	private Contact[] users = new Contact[50];

	public void start() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===电话本====");
			System.out.println("1.增加联系人");
			System.out.println("2.修改联系人");
			System.out.println("3.删除联系人");
			System.out.println("4.查看所有联系人");
			System.out.println("5.查找联系人");
			System.out.println("6.退出");
			System.out.println("============");
			System.out.print("请选择：");
			String input = sc.next();

			if (input.equals("1")) {
				addusers();
			} else if (input.equals("2")) {
				updatausers();
			} else if (input.equals("3")) {
				deleteusers();
			} else if (input.equals("4")) {
				showall();
			} else if (input.equals("5")) {
				findusers();
			} else if (input.equals("6")) {
				save();
				System.out.println("退出成功");
				break;
			} else {
				System.out.println("选择错误，请重新选择");
			}
		}
		sc.close();
	}

	private void addusers() {
		// System.out.print("请输入姓名：");
		// String name = sc.next();
		// System.out.print("请输入号码：");
		// String phone = sc.next();
		// System.out.print("请输入性别：");
		// String sexualit = sc.next();
		// System.out.print("请输入生日：");
		// String birthday = sc.next();
		//
		//// Contact con = new Contact(name,phone,sexualit,birthday);
		//
		// Contact con = new Contact();
		// con.setName(name);
		// con.setPhone(phone);
		// con.setSexualit(sexualit);
		// con.setBirthday(birthday);
		//
		Contact con = new Contact(getstr("输入姓名："), getstr("输入号码："),
				getstr("输入性别："), getstr("输入生日："));
		
			boolean flag = false;
			for (int i = 0; i < users.length; i++) {
				if(users[i] == null){
					users[i] = con;
					flag = true;
					break;
				}
			}
			if(flag){
				System.out.println("添加成功");
			}else{
				System.out.println("添加失败");
			}
	}
	

	private String getstr(String msg) {
		System.out.println(msg);
		return sc.next();
	}

	private void updatausers() {

		String name = getstr("输入要修改的姓名：");
		
		boolean flag = false;
		for (Contact con : users) {
			if(con != null && name.equals(con.getName())){
				con.setName(getstr("修改姓名为："));
				con.setPhone(getstr("修改号码为："));
				con.setSexualit(getstr("修改性别为："));
				con.setBirthday(getstr("修改生日为："));
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
	}

	private void deleteusers() {
		String name = getstr("输入要删除的姓名：");
		boolean flag = false;
		for (int i = 0; i < users.length; i++) {
			if(users[i] != null && name.equals(users[i].getName())){
				users[i] = null;
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
	}

	private void showall() {
		System.out.println("姓名\t号码\t性别\t生日");
		for (Contact con : users) {
			if(con != null){
				show(con);
			}
		}
	}

	private void show(Contact con) {
		// TODO 自动生成的方法存根
		
	}

	private void findusers() {
		System.out.print("查找条件：");
	}

	private void save() {

	}
}
