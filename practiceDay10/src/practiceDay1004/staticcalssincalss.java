package practiceDay1004;

public class staticcalssincalss {

	public static void main(String[] args) {
		outer2.inner2 b= new outer2.inner2();
//		 ���þ�̬�ڲ����еķǾ�̬��Ա�����������ڲ���Ķ������
	     System.out.println(b.add1(8, 9));

	}

}
class outer2{
	static class inner2{
		public   int add1(int a,int b){
		 return a+b;
		}
	}
    static class inner3{
    	public static int add2(int a ,int b){
    		return a+b;
    	}
    }
	}

