package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
Date d = new Date();
System.out.println(d);//��ӡ��ǰʱ��
long a =d.getTime();
System.out.println(a);//��ȡʱ�����1970�ĺ���
d.setTime(99999);
System.out.println(d);//��ӡSET���ʱ��

SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");//��ʽ������
System.out.println(sdf.format(d));
	}

}
