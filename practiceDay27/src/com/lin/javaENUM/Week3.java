package com.lin.javaENUM;

//java自带枚举之有抽象方法怎么调用
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
