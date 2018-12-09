package com.wuxin.prototype;

public class TestPrototypeResult {
	public static void main(String[] args) {
		//准备
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);
		
		//生成
		Product p1 = manager.create("strong message");
		Product p1_ = p1.createClone();
		if (p1 == p1_) {
			System.out.println("一样的对象");
		} else {
			System.out.println("两对象不一样");
		}
		p1.use("Hello World wuxin467周远");
		p1_.use("p1 kelong");
		Product p2 = manager.create("warning box");
		Product p2_ = p2.createClone();
		p2.use("Hello, world.");
		p2_.use("p2 kelong");
		Product p3 = manager.create("slash box");
		Product p3_ = p3.createClone();
		p3.use("Hello, world.");
		p3_.use("p3 kelong");
		
		/**
		 * 什么情况下使用Prototype模式?
		 * 1、对象种类繁多,无法将它们整合到一个类中时
		 * 2、难以根据类生成实例时
		 * 3、想解耦框架与生成的实例时
		 * 当多个类必须紧密结合时,代码中出现这些类的名字是没有问题的。但是如果那些需要被独立出来作为
		 * 组件复用的类的名字出现在代码中,那就有问题了。
		 */
	}
}
