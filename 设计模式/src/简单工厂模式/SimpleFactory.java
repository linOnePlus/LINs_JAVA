package �򵥹���ģʽ;

/*�ֽо�̬��������ģʽ������һ������Ĺ����ฺ�𴴽����ʵ��
 * �׶� ���Ҫ�������󣬾�Ҫ���������޸Ĺ�����*/
public class SimpleFactory {
	private SimpleFactory() {
	}

	public static Animal createInstance(String name) {
		switch(name) {
		case "dog":
			return new dog();
			
		case "cat":
		return new cat();
		
		case "tiger":
		return new tiger();
		default:
			System.out.println("u are wrong");
      return null;	
	}
}
}