package com.wuxin.bridge;

/**
 * 类的功能层次结构:CountDisplay类
 * RefinedAbstraction(改善后的抽象化)
 * 在Abstraction角色的基础上增加了新功能的角色
 * @author Administrator
 *
 */
public class CountDisplay extends Display{

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void multiDisplay(int times) {
		open();
		for (int i=0; i<times; i++) {
			print();
		}
		close();
	}
}
