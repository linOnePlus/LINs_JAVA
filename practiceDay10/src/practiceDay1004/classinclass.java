package practiceDay1004;

public class classinclass {

	public static void main(String[] args) {
		outer.inner a=new outer(). new inner();
     /* �ڲ��������ã�
                   �ⲿ��.�ڲ��� ������= �ⲿ�����.�ڲ������*/
		a.method();
}
}
class outer{
	class inner{
		public void method(){
			System.out.println("stupid crazy");
		}
	}
}
	

	



