package com.lin.javaENUM;
//java 自带枚举类之有参构造
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
