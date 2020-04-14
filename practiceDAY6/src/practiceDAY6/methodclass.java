package practiceDAY6;

public class methodclass {

	public static void main(String[] args) {
human s =new human();
print(s);
s.print();


	}
	
	public static void print(human s){//当形式参数是类名加对象时候，实际上是要一个对象
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