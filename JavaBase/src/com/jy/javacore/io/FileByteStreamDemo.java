package com.jy.javacore.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStreamDemo {

	public static void main(String[] args) {
		// 创建对象
		File file1 = new File("D:\\教学视频\\PPT\\Java教学大纲-du.png");
		File file2 = new File("D:\\\\教学视频\\\\PPT\\cp.png");

		FileInputStream fis;
		FileOutputStream fos;

		try {
			// 创建文件输入流
			fis = new FileInputStream(file1);
			// 创建文件输出流
			fos = new FileOutputStream(file2);
			int read = fis.read();
			while (read != -1) {
				fos.write(read); // 写入
				read = fis.read(); // 读取
			}
			// 关闭文件流
			fis.close();
			fos.close();
			System.out.println("Copy OK!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
