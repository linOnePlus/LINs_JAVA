package practice;
import java.util.Scanner;//����SCanner��
public class stringpractice {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//��������¼����󣬼�ʹ��Ҫ�����Σ�ֻ��Ҫһ��
		System.out.println("�������������");
		String name=sc.next();//���� �ַ��� ��ֵ��NAME
		//System.out.println("����������Ա�");
		//String gender=sc.next();
		sc.close();//��ˮ��ͷ

		/*String name = "����";//STRING��������  һ��δ֪ �����������
		String gender="women";*/
		switch(name){
		/*case "����":
			System.out.println("����ʶ�㣬����ÿ�");
			break;
		case"lzj":
			System.out.println("��Ҳ��ʶ�㣬���crhһ���ÿ�");
			break;
			default:
				System.out.println("��˭�� ���Ҳ���ʶ�㣬��رճ���");
				*/
		//����Case��͸
		case "����":
		case"lzj":
			System.out.println("����ʶ�㣬����ÿ�");
			break;//SWITCHû������BREAK����}�������
		default:
			System.out.println("��˭�� ���Ҳ���ʶ�㣬��رճ���");
		}
			
			
		}
  
	}


