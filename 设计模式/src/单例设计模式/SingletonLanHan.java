package �������ģʽ;
/* ����ʽ �ռ任ʱ��
 * �Ȳ��������� ����ʱ�Ŵ������� 
 * ���̵߳���ʱ ���ܻ���ɴ�������������� */

class SingletonLanHan{
	private SingletonLanHan () {	}//˽�й��췽���� ��Ȼ�����ഴ���������
	private  static SingletonLanHan s; //�����Ǿ�̬�ģ�����̬�������ʲ���
	public static SingletonLanHan getInstance() {
		if(s==null)
			s=new SingletonLanHan();
		return s ;
	}
}