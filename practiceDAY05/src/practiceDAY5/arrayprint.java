package practiceDAY5;
//���鶨���Լ���̬��ʼ��
public class arrayprint {

	public static void main(String[] args) {
	int [] lin=new int[]{11,22,223,211,333,};//��̬�������飬���鶨���ʽint [] ������
    print(lin);//ֱ�ӵ��÷�������ʽ����ֱ�Ӹ���������
    System.out.println();
	int [] lin2 = new int[5];
	print(lin2);
	byte [] lin3 =new byte[6];
	print(lin3);    //��̬��ʼ�������� int byte long shortĬ��ֵΪ0
	System.out.println();
	char [] lin4 = new char[6];
	print(lin4);  //��̬��ʼ�����ַ���Ĭ��ֵΪ\u0000
	System.out.println();
	boolean [] lin5 = new boolean[5];//��̬��ʼ�� BOOLEANĬ��ֵΪFALSE
	print(lin5);
   }
  public static void print(int[] lin){//���������ֻ����ʽ��������������������ö��� 
	  for(int i=0;i<lin.length;i++){
		  System.out.print(lin[i]+" ");
	  }
  }
  public static void print(byte[] lin){//��������
	  for(int i=0;i<lin.length;i++){
		  System.out.print(lin[i]+" ");
	  }
  }
  public static void print(float[] lin){//��������
	  for(int i=0;i<lin.length;i++){
		  System.out.print(lin[i]+" ");
	  }
}
  public static void print(boolean[] lin){//��������
	  for(int i=0;i<lin.length;i++){
		  System.out.print(lin[i]+" ");
	  }
  }
  public static void print(char[] lin){//��������
	  for(int i=0;i<lin.length;i++){
		  System.out.print(lin[i]+" ");
	  }
  }
}

