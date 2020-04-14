package com.lin.String;

public class stringPanDuan {

	public static void main(String[] args) {
      String s1 ="林泽佳JAVA";
      System.out.println(s1.equals("林泽佳JAVA"));//判断值是否相等，区分大小写
      System.out.println(s1.equalsIgnoreCase("林泽佳java"));//判断值是否相等，不区分大小写
      System.out.println(s1.contains("泽"));//判断是否包含
      System.out.println(s1.startsWith("林"));//是否以lin开头
      System.out.println(s1.endsWith("A"));//
      System.out.println(s1.isEmpty());
      
    	
	}

}
