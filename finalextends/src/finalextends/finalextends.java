package finalextends;
/*
*@author linoneplus
*接口可以多继承 无方法体
*普通类可以多实现多个接口
*/
public class finalextends implements demo2,demo3 {
public static void main(String[] args) {
	System.out.println(age+""+school);
}
}

interface demo1 {
	String name = "lin";
}

interface demo2 extends demo1,demo3{
	int age = 23;
}

interface demo3 extends demo1{
	String school = "henggang";
}