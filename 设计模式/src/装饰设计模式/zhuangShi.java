package װ�����ģʽ;

/*��ĳ������а�װ��ʹ�书�ܸ���ǿ��*/


	interface Coder {
		public void code();
	}

	class Student implements Coder {// ��װ����

		@Override
		public void code() {
			System.out.println("javase");
			System.out.println("database");
		}

	}

	class SuperStudent implements Coder {//װ����
		private Student s;
public SuperStudent(Student s) {//����дһ���вι��촫һ��ʵ������װ�����������Ȼ����ָ���쳣
	this.s=s;
}
		@Override
		public void code() {
			s.code();
			System.out.println("javaweb");
		}

	}

