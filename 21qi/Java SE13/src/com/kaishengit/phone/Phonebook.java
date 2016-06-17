package com.kaishengit.phone;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.kaishengit.entity.Contact;

public class Phonebook {
	
	private Scanner sc = new Scanner(System.in);
	
	private Contact[] users = new Contact[50];
	
	public void start() {
		read();
		Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("====电话本====");
		System.out.println(" 1.新增联系人");
		System.out.println(" 2.修改联系人");
		System.out.println(" 3.删除联系人");
		System.out.println(" 4.查看所有联系人");
		System.out.println(" 5.查找联系人");
		System.out.println(" 6.退出");
		System.out.println("============");
		System.out.print("请选择");
		String input = sc.next();
		
		if(input.equals("1")){
			addusers();
		}else if(input.equals("2")){
			updateusers();
		}else if(input.equals("3")){
			deletepusers();
		}else if(input.equals("4")){
			showallusers();
		}else if(input.equals("5")){
			findusers();
		}else if(input.equals("6")){
			save();
			System.out.println("【退出成功！】");
			break;
		}else{
			System.out.println("【选择错误，请重新选择！】");
		}
		
		}
	
		sc.close();
	}
//	新增联系人
	
	private void addusers() {
//		System.out.println("请输入姓名:");
//		String name = sc.next();
//		System.out.println("请输入号码:");
//		String phone = sc.next();
//		System.out.println("请输入性别:");
//		String sexualit = sc.next();
//		System.out.println("请输入生日:");
//		String birthday = sc.next();
//
//		Contact con = new Contact();
//		con.setName(name);
//		con.setPhone(phone);
//		con.setSexualit(sexualit);
//		con.setBirthday(birthday);
		
		Contact con = new Contact(getstr("请输入姓名:"), getstr("请输入号码:"), 
				getstr("请输入性别:"), getstr("请输入生日:"));
		
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
//	修改联系人
	private void updateusers() {
		String name = getstr("请输入要修改的姓名");
		
		boolean flag = false;
		for (Contact con : users) {
			if(con != null && name.equals(con.getName())) {
//				con.setName(getstr("修改姓名为："));
				con.setPhone(getstr("修改电话为："));
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
		
			
//	删除联系人
	private void deletepusers() {
		String name = getstr("输入要删除的姓名");
		
		boolean flag = false;
		for(int i = 0; i < users.length; i++){
			if (users [i] != null && name.equals(users[i].getName())){
				users [i] = null; 
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
		
	

//	查看所有联系人
	private void showallusers() {
		System.out.println("姓名\t电话\t性别\t生日");
		for(Contact con : users){
			if(con != null){
				show(con);
			}
		}
	}
		
//		System.out.println("姓名\t电话\t\t性别\t生日");
//		for(Contact con : users){
//			if(con != null){
//				show(con);
				
//				System.out.print(con.getName());
//				System.out.print("\t");
//				System.out.print(con.getPhone());
//				System.out.print("\t");
//				System.out.print(con.getSexualit());
//				System.out.print("\t");
//				System.out.print(con.getBirthday());
//			}
//		}
		
			


	//	查找联系人
	private void findusers() {
		
		String str = getstr("查找条件");
		System.out.println("姓名\t电话\t\t性别\t生日");
		for(Contact con : users){
			if(con != null&& 
					(con.getName().contains(str)||con.getPhone().contains(str))){
				show(con);
			}
				
		}
	}	
	
	private String getstr(String msg){
		System.out.print(msg);
		return sc.next();
	}
	
	private void show(Contact con){
			System.out.print(con.getName());
			System.out.print("\t");
			System.out.print(con.getPhone());
			System.out.print("\t");
			System.out.print(con.getSexualit());
			System.out.print("\t");
			System.out.print(con.getBirthday());
			System.out.println();
			
		}
		
	final String FGF = ","; 
	File file = new File("E:/phoneBook.data");
	private void save() {
		FileWriter fw =null;
		BufferedWriter bw =null;
			try {
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				
				for(Contact con : users){
					if(con != null){
						String str = con.getName() + FGF + con.getPhone() + FGF + 
								con.getSexualit() + FGF +con.getBirthday();
						bw.write(str);
						bw.newLine();
					}
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}try {
				bw.flush();
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	private void read() {
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String str = br.readLine();
			while (str != null){
				String[] strs = str.split(FGF);
				if(strs.length == 4){
					Contact con = new Contact(strs[0],strs[1],strs[2],strs[3]);
					for(int i = 0; i < users.length; i++){
						if(users[i] == null){
							users[i] = con;
							break;
						}
					}
					
				}
				str = br.readLine();
			}
			
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
		

