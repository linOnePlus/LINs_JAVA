package list;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {

		List a = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			a.add(i);//LISt���з���1 ��β����Ԫ��
		}
		a.add(10, 26);//��ָ������������Ԫ��
		int v = (int) a.get(2);// GET���� ������ ��ֵ ����OBJECT����� ����ǿת ���Զ�����
		System.out.println(v);
		System.out.println(a.get(10));
		Integer set = (Integer) a.set(10, 55);//�޸��ƶ�������Ԫ��
		System.out.println(set);
		
		

	}

}
