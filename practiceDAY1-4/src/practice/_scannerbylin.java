package practice;
import java.util.Scanner;//����Scanner��
public class _scannerbylin {

	
	public static void main(String[] args) {
//����������е����ֵ author��Lin one puls
		Scanner sc =new Scanner(System.in);//��������¼�����
		
		System.out.print("�����һ����");
		int x= sc.nextInt();//ͨ������¼ȡ����
		System.out.print("������ڶ�������");
		int y = sc.nextInt();
		System.out.print("���������������");
		int z = sc.nextInt();
		
//����һ��������ʱ����TEMP�����ֵMAX
		
		/*sc.close();
		  int temp =(x>y)?x:y;
		int max =(temp>z)?temp:z;
		System.out.println("�������������ֵ�����ֵ��"+max);*/
//��������IF���Ƕ��ʹ��
		sc.close();//�ر�Scanner
		if(x>y){
			if(x>z){
				System.out.println("���ֵ��"+x);
			}else{
				System.out.println("���ֵ��"+z);
			}
		}else{
			if(y>z){
				System.out.println("���ֵ��"+y);
			}else{
				System.out.println("���ֵ��"+z);
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
