package com.wuxin.template.method;

public class TestTemplateResult {
	public static void main(String[] args) {
		AbstractDisplay d1 =new CharDisplay('H');
		AbstractDisplay d2 =new StringDisplay("Hello World");
		d1.display();
		d2.display();
	}
	
	/**
	 * Template Method模式的优点:在父类的模板方法中编写了算法,因此无需在每个子类中再编写算法。
	 * 如果在使用Template Method模式进行编程,当我们在模板方法中发现Bug时,只需要修改模板方法即可解决问题。
	 * 类类对子类的要求:
	 * 	1、在子类中可以使用父类中定义的方法
	 * 	2、可以通过在子类中增加方法以实现新的功能
	 * 	3、在子类中重写父类的方法可以改变程序的行为
	 * 声明抽象方法的目的:
	 * 	1、期待子类去实现抽象方法
	 * 	2、要求子类去实现抽象方法
	 */
}
