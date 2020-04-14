package practiceDAY5;
//数组定义以及动态初始化
public class arrayprint {

	public static void main(String[] args) {
	int [] lin=new int[]{11,22,223,211,333,};//静态定义数组，数组定义格式int [] 数组名
    print(lin);//直接调用方法，形式参数直接复制数据名
    System.out.println();
	int [] lin2 = new int[5];
	print(lin2);
	byte [] lin3 =new byte[6];
	print(lin3);    //动态初始化：整型 int byte long short默认值为0
	System.out.println();
	char [] lin4 = new char[6];
	print(lin4);  //动态初始化，字符型默认值为\u0000
	System.out.println();
	boolean [] lin5 = new boolean[5];//动态初始化 BOOLEAN默认值为FALSE
	print(lin5);
   }
  public static void print(int[] lin){//方法定义的只是形式参数，在这个方法里有用而已 
	  for(int i=0;i<lin.length;i++){
		  System.out.print(lin[i]+" ");
	  }
  }
  public static void print(byte[] lin){//方法重载
	  for(int i=0;i<lin.length;i++){
		  System.out.print(lin[i]+" ");
	  }
  }
  public static void print(float[] lin){//方法重载
	  for(int i=0;i<lin.length;i++){
		  System.out.print(lin[i]+" ");
	  }
}
  public static void print(boolean[] lin){//方法重载
	  for(int i=0;i<lin.length;i++){
		  System.out.print(lin[i]+" ");
	  }
  }
  public static void print(char[] lin){//方法重载
	  for(int i=0;i<lin.length;i++){
		  System.out.print(lin[i]+" ");
	  }
  }
}

