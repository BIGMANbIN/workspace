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
//		System.out.println("等待客户端连接");
//		Socket s = server.accept();
//		System.out.println("客户端连接成功");
		// 获取客户端输入流，可以读取服务器端发送的数据 
		  //InputStream is = s.getInputStream();
		  // 获取输出流，可以向服务器端发送数据
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
//			  System.out.println("请输入：");
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
//		  System.out.println("运行结束");
//		 
		
		
		Scanner sc = new Scanner(System.in);
		
		ServerSocket server = new ServerSocket(8888);
		
		Socket s = server.accept();
		System.out.println("客户端连接成功");
		
		InputStream is = s.getInputStream();
		OutputStream os =s.getOutputStream();
		
		System.out.println("  猜拳游戏");
		System.out.println("==========");
		System.out.println("1:石头");
		System.out.println("2:剪刀");
		System.out.println("3:布");
		System.out.println("==========");
		System.out.println("请选择");
		int wo = sc.nextInt();
		os.write(wo);
		System.out.println("请出拳！");
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
		  server.close();
		  
		  System.out.println("运行结束");
	}

}
