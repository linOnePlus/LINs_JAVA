package 装饰设计模式;

/*对某个类进行包装，使其功能更加强大*/


	interface Coder {
		public void code();
	}

	class Student implements Coder {// 被装饰类

		@Override
		public void code() {
			System.out.println("javase");
			System.out.println("database");
		}

	}

	class SuperStudent implements Coder {//装饰类
		private Student s;
public SuperStudent(Student s) {//必须写一个有参构造传一个实例被包装对象进来，不然报空指针异常
	this.s=s;
}
		@Override
		public void code() {
			s.code();
			System.out.println("javaweb");
		}

	}

