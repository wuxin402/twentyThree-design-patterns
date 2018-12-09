package com.wuxin.factory.method;

public class TestFactoryResult {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("小明");
		Product card2 = factory.create("小红");
		Product card3 = factory.create("小刚");
		card1.use();
		card2.use();
		card3.use();
	}
	
	/**
	 * Factory模式:生成实例的工厂
	 * 父类决定市领导生成方式,但并不决定所要生成的具体的类,具体的处理全部交给子类负责,
	 * 这样就可以将生成实例的框架和实际负责生成实例的类解耦
	 * 使用设计模式设计类时,必须要向维护这些类的开发人员正确地传达设计这些设计模式的意图,
	 * 否则,维护人员在修改设计时可能会违背设计者最初的意图。
	 */
}
