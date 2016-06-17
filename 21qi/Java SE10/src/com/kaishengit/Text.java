package com.kaishengit;

public class Text {

	public static void main(String[] args){
		
		String words = "张三,18,男";
		String[] str = words.split(",");
		System.out.println("姓名:" + str[0]);
		System.out.println("年龄:" + str[1]);
		System.out.println("性别:" + str[2]);
		
	}
}
