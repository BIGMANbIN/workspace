package com.kaishengIT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	
	public static void main(String[] args) throws IOException{
		
//		Scanner sc = new Scanner(System.in);
//		
//		Socket client = new Socket("127.0.0.1", 8888);
//		System.out.println("���ӷ�����");
		// ��ȡ�ͻ��������������Զ�ȡ�������˷��͵����� 
		  //InputStream is = client.getInputStream();
		  // ��ȡ�������������������˷�������
		  //OutputStream os = client.getOutputStream();
		  
//		  byte[] buffer = new byte[100];
//		  is.read(buffer);
//		  String a = new String (buffer);
		

		//		  System.out.println(a);
//		  BufferedReader b = new BufferedReader(new InputStreamReader(is));
//		  System.out.println("��ʼ��ȡ��������Ϣ");
//		  String msg = b.readLine();
//		  while(msg == null){  msg = b.readLine();
//		  }
//		  
//		  System.out.println(msg);
//		  System.out.println("��ȡ��������Ϣ�ɹ�");
//		  
//		  InputStream is = client.getInputStream();
//		  OutputStream os =client.getOutputStream();
//		  
//		  	PrintWriter out = new PrintWriter(os,true);
//		  	BufferedReader in = new BufferedReader(new InputStreamReader(is));
//		  	
//		  	System.out.println("���������ӳɹ����ȴ�������Ϣ");
//		  	
//		  	while(true){
//		  		
//		  		String b;
//				  
//				do{
//					  b = in.readLine();
//				  }while(b == null);
//				  System.out.println(b);
//				  System.out.println("�����룺");
//				  b = sc.next();
//				  out.println("client" + b);
//				  }
//		  
		  	
		Scanner sc = new Scanner(System.in);
			
		Socket client = new Socket("127.0.0.1", 8888);
			System.out.println("���������ӳɹ�");
		 
		InputStream is = client.getInputStream();
		  OutputStream os =client.getOutputStream();
		  
		  	PrintWriter out = new PrintWriter(os,true);
		  	BufferedReader in = new BufferedReader(new InputStreamReader(is));
		  	
		  	System.out.println("  ��ȭ��Ϸ");
			System.out.println("==========");
			System.out.println("1:ʯͷ");
			System.out.println("2:����");
			System.out.println("3:��");
			System.out.println("==========");
			System.out.println("��ѡ��");
			int wo = sc.nextInt();
			os.write(wo);
			System.out.println("�ȴ��Է���ȭ��");
			int ni = is.read();
			
			Myutil.bijiao(wo, ni);
			System.out.println("�ҳ�ȭ:" + Myutil.qStr(wo) + "�Է���ȭ:" + Myutil.qStr(ni));
			
			int result = Myutil.bijiao(wo, ni);
			if (result == 0){
				System.out.println("ƽ��!");
			}
			if (result == 1){
				System.out.println("��Ӯ��!");
			}
			if (result == 2){
				System.out.println("������!");
			}
		
			
			
		
		
		
		
		
		 sc.close();
		 is.close();
		 os.close();
		 client.close();
		 
		 System.out.println("���н���");
		 
		 
		 //		  
//		  //new java.util.Scanner(System.in).nextLine();
//		  System.out.println("���н���");
//		  
		  

	}
	

	

}
