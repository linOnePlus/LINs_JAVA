package com.lin.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static void main(String[] args) throws IOException {
	ServerSocket s1= new ServerSocket(16666);
    Socket accept = s1.accept();
    InputStream is = accept.getInputStream();
    OutputStream os = accept.getOutputStream();
   os.write("我是服务器".getBytes());
    
}
}
