package kaishengit;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/tom.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:/tom2.png"));
		byte[] byt = new byte[1024];
		int len = -1;
		while ((len = bis.read(byt)) != -1) {
			bos.write(byt, 0, len);
		}
		bos.flush();
		bos.close();
		bis.close();
	}
}
