package com.lin.javaENUM;
//java �Դ�ö����֮�вι���
public enum Week2 {
	MON("xingqiyi "),TUE("xingqier"),WED("xingqisan");
	String name ;
	private Week2(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	
}
