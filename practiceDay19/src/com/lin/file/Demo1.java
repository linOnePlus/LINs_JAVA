package com.lin.file;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		File f= new  File("D:\\BaiduNetdiskDownload\\01javase\\lin2");
		File b= new  File("D:\\BaiduNetdiskDownload\\01javase\\lin2\\lin");
		boolean mkdir = f.mkdir();
		boolean createNewFile = b.createNewFile();
		boolean directory = f.isDirectory();
		System.out.println(directory+""+mkdir+""+createNewFile);
		String[] list = f.list();//找到目录下所有文件名称数组
		for (String string : list) {
			System.out.println(string);
		}
		File[] listFiles = f.listFiles();//找到目录下所有文件对象数组
		for (File file : listFiles) {
			System.out.println(file.toString());
		}
	}
}
