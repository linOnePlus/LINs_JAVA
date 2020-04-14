package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
Date d = new Date();
System.out.println(d);//打印当前时间
long a =d.getTime();
System.out.println(a);//获取时间距离1970的毫秒
d.setTime(99999);
System.out.println(d);//打印SET后的时间

SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");//格式化日期
System.out.println(sdf.format(d));
	}

}
