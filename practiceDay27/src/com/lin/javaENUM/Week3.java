package com.lin.javaENUM;

//java�Դ�ö��֮�г��󷽷���ô����
public enum Week3 {
	MON("xingqiyi ") {

		@Override
		public void show() {
			System.out.println("xingqiyi");
		}
	},
	TUE("xingqier") {

		@Override
		public void show() {
			System.out.println("xingqier");
		}
	},
	WED("xingqisan") {

		@Override
		public void show() {
			System.out.println("xingqisan");
		}
	};
	String name;

	private Week3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void show();
}
