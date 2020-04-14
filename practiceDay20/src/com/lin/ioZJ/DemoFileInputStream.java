package com.lin.ioZJ;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/*
*@author linone
*/
public class DemoFileInputStream {

	public static void main(String[] args) throws IOException {
		File file = new File("linzejia.txt");
		InputStream is = new java.io.FileInputStream(file);
		int read = is.read();
		System.out.println(read);
		
		
	}
}
