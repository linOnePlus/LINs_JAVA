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
		String[] list = f.list();//�ҵ�Ŀ¼�������ļ���������
		for (String string : list) {
			System.out.println(string);
		}
		File[] listFiles = f.listFiles();//�ҵ�Ŀ¼�������ļ���������
		for (File file : listFiles) {
			System.out.println(file.toString());
		}
	}
}
