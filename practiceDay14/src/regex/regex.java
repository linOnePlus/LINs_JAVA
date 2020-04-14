package regex;

public class regex {

	public static void main(String[] args) {
// matches();
// split();
 String s2 ="linzejiaJAVA";
 System.out.println(s2.replaceAll(".{12}", "linoneplus"));
 System.out.println(s2.replaceAll("\\D{6}", "linoneplus"));
		
	}

	private static void matches() {
		String regex = "1[35789]\\d{9}";
		 System.out.println("15999549759".matches(regex));
	}

	private static void split() {
		String regex2 ="\\s";
		 String [] arr="04160620 linzejia".split(regex2);  //返回值类型string[]
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
			
		}
	}

}
