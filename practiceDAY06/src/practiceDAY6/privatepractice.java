package practiceDAY6;

public class privatepractice {

	public static void main(String[] args) {
		people lin=new people();
		lin.setName("�����");
		System.out.println(lin.getName());//���getname�Ľ��ֵ��
		lin.go();

	}


}
class people{
   private String name ;
   private int age;
   public void setName(String name){//����Ѹ�ֵ����ʽ����STRING NAME ��
	   this.name=name;//name��ֵ����Ա����NAME��THIS ��ʾ�������ĵ�ֵַ���൱��lin.name
   }
   public String  getName(){
	   return this.name;
   }
   
  public void go(){
	  System.out.println(name+age);//���lin�����������NAME ��AGE��
  }
}