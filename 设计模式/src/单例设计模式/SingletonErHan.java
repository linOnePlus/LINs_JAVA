package �������ģʽ;
/* �������ģʽ ��֤�����ڴ���ֻ��һ�����󣬲����Դ���������� */
//����ʽ ʱ�任�ռ�  ���Ƽ�ʹ��
class SingletonErHan{

	private  SingletonErHan() {
		super();
	}
	private static SingletonErHan s=new SingletonErHan();
	public static SingletonErHan getInstance() {
		return s;
	}
}