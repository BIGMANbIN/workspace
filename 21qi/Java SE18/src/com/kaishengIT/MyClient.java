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
//		System.out.println("连接服务器");
		// 获取客户端输入流，可以读取服务器端发送的数据 
		  //InputStream is = client.getInputStream();
		  // 获取输出流，可以向服务器端发送数据
		  //OutputStream os = client.getOutputStream();
		  
//		  byte[] buffer = new byte[100];
//		  is.read(buffer);
//		  String a = new String (buffer);
		

		//		  System.out.println(a);
//		  BufferedReader b = new BufferedReader(new InputStreamReader(is));
//		  System.out.println("开始读取服务器消息");
//		  String msg = b.readLine();
//		  while(msg == null){  msg = b.readLine();
//		  }
//		  
//		  System.out.println(msg);
//		  System.out.println("读取服务器消息成功");
//		  
//		  InputStream is = client.getInputStream();
//		  OutputStream os =client.getOutputStream();
//		  
//		  	PrintWriter out = new PrintWriter(os,true);
//		  	BufferedReader in = new BufferedReader(new InputStreamReader(is));
//		  	
//		  	System.out.println("服务器连接成功，等待接收消息");
//		  	
//		  	while(true){
//		  		
//		  		String b;
//				  
//				do{
//					  b = in.readLine();
//				  }while(b == null);
//				  System.out.println(b);
//				  System.out.println("请输入：");
//				  b = sc.next();
//				  out.println("client" + b);
//				  }
//		  
		  	
		Scanner sc = new Scanner(System.in);
			
		Socket client = new Socket("127.0.0.1", 8888);
			System.out.println("服务器连接成功");
		 
		InputStream is = client.getInputStream();
		  OutputStream os =client.getOutputStream();
		  
		  	PrintWriter out = new PrintWriter(os,true);
		  	BufferedReader in = new BufferedReader(new InputStreamReader(is));
		  	
		  	System.out.println("  猜拳游戏");
			System.out.println("==========");
			System.out.println("1:石头");
			System.out.println("2:剪刀");
			System.out.println("3:布");
			System.out.println("==========");
			System.out.println("请选择");
			int wo = sc.nextInt();
			os.write(wo);
			System.out.println("等待对方出拳！");
			int ni = is.read();
			
			Myutil.bijiao(wo, ni);
			System.out.println("我出拳:" + Myutil.qStr(wo) + "对方出拳:" + Myutil.qStr(ni));
			
			int result = Myutil.bijiao(wo, ni);
			if (result == 0){
				System.out.println("平局!");
			}
			if (result == 1){
				System.out.println("你赢了!");
			}
			if (result == 2){
				System.out.println("你输了!");
			}
		
			
			
		
		
		
		
		
		 sc.close();
		 is.close();
		 os.close();
		 client.close();
		 
		 System.out.println("运行结束");
		 
		 
		 //		  
//		  //new java.util.Scanner(System.in).nextLine();
//		  System.out.println("运行结束");
//		  
		  

	}
	

	

}
