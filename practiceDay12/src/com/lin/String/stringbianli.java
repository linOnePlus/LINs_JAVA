package com.lin.String;
/*×Ö·û´®±éÀú*/

public class stringbianli {

	public static void main(String[] args) {
 String str ="linzejiajava_";
 bianli(str);
	}

	private static void bianli(String str) {
		int big =0;
		int small =0;
		int num =0;
		int other = 0;
//		int length= str.length();
	    char [] arr = str.toCharArray();
	    for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (c>='A'&&c<='Z') {
				big++;
			}
			else if (c>='a'&&c<='z') {
				small++;
			}
			else if(c>='1'&&c<='9'){
			num++;	
			}
			else{
				other++;
			}
		}System.out.println("´óĞ´×ÖÄ¸"+big+"Ğ¡Ğ´×ÖÄ¸"+small+"Êı×Ö"+num+"·ûºÅ"+other);
	}

}
