package leijiazai;
//初始化顺序 （静态变量、静态初始化块）>（变量、初始化块）>构造器
public class test1 {   
	  
    // 静态变量 
  
    public static String staticField = "静态变量";
  
    // 变量 
  
    public String field = "变量";   
  
    // 静态初始化块 

    static {   
        System.out.println(staticField);   
        System.out.println("静态初始化块");   
    }   
  
    // 初始化块 
  
    {   
        System.out.println(field);   
        System.out.println("初始化块");   
    }   
  
    // 构造器 
  
    public test1() {   
        System.out.println("构造器");   
    }   
  
    public static void main(String[] args) {
  
        new test1();   
    }   
}  
