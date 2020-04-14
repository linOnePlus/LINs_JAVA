package com.lin.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s1 = new Socket("192.168.0.102", 16666);
		InputStream is = s1.getInputStream();
		OutputStream os = s1.getOutputStream();
		byte [] arr =new byte[1024];
		int read = is.read(arr);
		System.out.println(new String(arr,0,read));
	}
}
