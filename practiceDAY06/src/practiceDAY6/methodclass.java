package practiceDAY6;

public class methodclass {

	public static void main(String[] args) {
human s =new human();
print(s);
s.print();


	}
	
	public static void print(human s){//����ʽ�����������Ӷ���ʱ��ʵ������Ҫһ������
		s.name="LZJ";
		s.age=20;
		s.gender="man";
		
	}

}
class human{
	String  name;
	int age;
	String gender;
	public void print(){
		System.out.println(name+" "+age+" "+gender);
	}
}