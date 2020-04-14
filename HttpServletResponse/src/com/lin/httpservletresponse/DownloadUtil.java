package com.lin.httpservletresponse;

import java.io.UnsupportedEncodingException;

import sun.misc.BASE64Encoder;

/*
 * 当下载的文件是中文路径，并且是火狐浏览器的时候 
 * 要调用以下的方法对文件进行编码
 * */
public class DownloadUtil {

	public static String base64EncodeFileName(String fileName) {
		BASE64Encoder base64Encoder = new BASE64Encoder();
		try {
			return "=?UTF-8?B?"
					+ new String(base64Encoder.encode(fileName
							.getBytes("UTF-8"))) + "?=";
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
