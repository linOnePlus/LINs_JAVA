/**
 * ������С��Ϸ
 * ����¼��һ�����֣���Math�����random�����������������
 * ��if����ж�¼�����ֺ�������Ĵ�С
 * author linoneplus
 */
package practiceDay7;
import java.util.*;
public class randomgame {

	public static void main(String[] args) {
		Scanner a=new Scanner (System.in);
		int r=(int)(Math.random()*10+1);
for(;;){
		System.out.println("������һ����������");
		int x=a.nextInt();
		
		
		if(x>r){
			System.out.println("����������ֹ���");
		}else if(x<r){
			System.out.println("�����������̫С");
		}else{
			System.out.println("���¶��ˡ�");
			break;
		}
		
	}System.out.println("��Ϸ������ף���������");
	}
}
