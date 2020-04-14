package com.lin.ioZJ;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/*
*@author linone
*/
public class DemoFileOutputStream {
public static void main(String[] args) throws IOException {
	
	OutputStream os = new java.io.FileOutputStream("C:\\Users\\Administrator.ZCPC-20180228WE\\Desktop\\out.txt");
	os.write(157);
	byte [] arr= new byte[]{22,33,11,44};
	os.write(arr);
	
}
}
