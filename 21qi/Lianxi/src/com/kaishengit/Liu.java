package com.kaishengit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Liu {

	public static void main(String[] args) throws IOException {

		File f = new File("E:/text");

		FileInputStream in = new FileInputStream(f);
		
		int file = (int) f.length();
		
		byte[] data = new byte[file];
		in.read(data);
		
//		for (byte b : data) {
//			System.out.println(b);
//		}

		String str = new String(data);
		System.out.println(str);
		
		in.close();
	}

}
