package com.lin.array;

public class doublearrayprintadd {

	public static void main(String[] args) {
	int [][]lin2={{0,1,3},{3,3,11},{1232,3312}};
    print(lin2);
     int [] lin={3,3,111,3,3};
    int a= add(lin);
    System.out.println(a);
    int x= add(lin2);
    System.out.println(x);
	}
public static void print(int[][]arr){
	for(int i=0;i<arr.length;i++){//һά����ĸ���
		for(int j=0;j<arr[i].length;j++){//һά������Ԫ�صĸ���
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	}
    public static int add(int[]arr){//һά�������
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		return sum;
}
    public static int add(int[][]arr){//��ά�������
    	int sum =0;
    	for(int i =0; i<arr.length ;i++){
		 for(int j =0;j<arr[i].length;j++){
		    sum=sum+arr[i][j];
    		}
    	
    	}
    	return sum;		
    }
}
