package com.lin.suanfa;
/*
*@author linone
*/

import java.util.UUID;

public class uuid {

	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());
		String a="fuckyou";
		System.out.println(a.lastIndexOf(1));
		System.out.println(a.lastIndexOf("u"));
		System.out.println(a.substring(a.lastIndexOf("f")));
	}
}
