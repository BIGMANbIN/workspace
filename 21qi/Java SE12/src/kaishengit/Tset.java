package kaishengit;

import java.io.File;
import java.io.IOException;

public class Tset {

//	public static void main(String[] args) {
//		
//	System.out.println(abc(10));
//		
//	}
//	
////	 递归算法
//	static int abc(int n){
//		if(n == 1){
//			return 0;
//		}
//		if(n == 2){
//			return 1;
//		}
//		return abc(n-1) + abc(n-2);
//	}

	public static void main(String[] args) throws IOException{
//		创建文件夹
//		
		File file = new File("E:/hhh");
//		file.mkdirs();
		
//		System.out.println(file.exists());
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getName());
//		System.out.println(file.length());
		
		deleteFile(file);
	}
	
//	static void deleteFile (File hahaha){
//		
//		if(hahaha.isFile() || hahaha.listFiles().length == 0){
//			hahaha.delete();
//			
//		}else{
//			File[] fs = hahaha.listFiles();
//			for (File file : fs) {
//				deleteFile(file);
//			}
//		
//		}
		
//	}
	
	static void deleteFile(File hhh){
		
		if(hhh.isFile() || hhh.listFiles().length == 0){
			hhh.delete();
		}else{
			File[] fs = hhh.listFiles();
			for (File file : fs) {
				deleteFile(file);
			}
		}
	}
	
}
