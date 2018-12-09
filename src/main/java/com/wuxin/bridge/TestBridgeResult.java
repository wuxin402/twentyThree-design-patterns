package com.wuxin.bridge;

public class TestBridgeResult {
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, China."));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
	}
	
	/**
	 * 继承是强关联,委托是弱关联
	 * 在类的两个层次结构之间搭建桥梁的Bridge模式,通过分离这两种类的层次结构,可以
	 * 更加清晰的扩展类。
	 * 1、通过类的功能层次结构上,继承父类,在子类中增加功能(CountDisplay)
	 * 2、通过类的实现层次结构上,通过不同的实现类,来获得不同的方法实现(StringDisplayImpl)
	 * 	Display类和DisplayImpl类两者是弱关联关系,只有在创建Display对象时才去确定关系,确定
	 * DisplayImpl的真正实现类。
	 * 通过这两种方式来扩展需求。
	 */
}
