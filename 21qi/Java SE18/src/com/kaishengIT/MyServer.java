package com.kaishengIT;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class MyServer {
	
	public static void main(String[] args) throws IOException  {
//		Scanner sc = new Scanner(System.in);
//		
//		ServerSocket server = new ServerSocket(8888);
//		System.out.println("�ȴ��ͻ�������");
//		Socket s = server.accept();
//		System.out.println("�ͻ������ӳɹ�");
		// ��ȡ�ͻ��������������Զ�ȡ�������˷��͵����� 
		  //InputStream is = s.getInputStream();
		  // ��ȡ�������������������˷�������
		  //OutputStream os =s.getOutputStream();
		  
		  //os.write("Hello.java!!".getBytes());
		  //PrintWriter out = new PrintWriter(os,true);
		  //out.println("Hello.java!!");
		  //out.flush();
		  
//		InputStream is = s.getInputStream();
//		OutputStream os =s.getOutputStream();
//		
//		  PrintWriter out = new PrintWriter(os,true);
//		  BufferedReader in = new BufferedReader(new InputStreamReader(is));
		  
		  
		  
//		  while(true){
//			  System.out.println("�����룺");
//			  String b = sc.next();
//			  out.println("server" + b);
//			  
//			  do{
//				  b = in.readLine();
//			  }while(b == null);
//			  System.out.println(b);
//		}
//		  sc.close();
//		  is.close();
//		  os.close();
//		  server.close();
//		  //new java.util.Scanner(System.in).nextLine();
//		  System.out.println("���н���");
//		 
		
		
		Scanner sc = new Scanner(System.in);
		
		ServerSocket server = new ServerSocket(8888);
		
		Socket s = server.accept();
		System.out.println("�ͻ������ӳɹ�");
		
		InputStream is = s.getInputStream();
		OutputStream os =s.getOutputStream();
		
		System.out.println("  ��ȭ��Ϸ");
		System.out.println("==========");
		System.out.println("1:ʯͷ");
		System.out.println("2:����");
		System.out.println("3:��");
		System.out.println("==========");
		System.out.println("��ѡ��");
		int wo = sc.nextInt();
		os.write(wo);
		System.out.println("���ȭ��");
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
		  server.close();
		  
		  System.out.println("���н���");
	}

}
