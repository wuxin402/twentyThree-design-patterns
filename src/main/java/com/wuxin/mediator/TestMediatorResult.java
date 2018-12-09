package com.wuxin.mediator;

/**
 * 测试Mediator模式
 * @author Administrator
 *
 */
public class TestMediatorResult {
	public static void main(String[] args) {
		new LoginFrame("Mediator Sample");
	}
	
	/**
	 * 主要是将需要集中处理的业务逻辑放到LoginFrame中,哪怕其中的某个需求改变了,
	 * 并不会影响其它组件的使用。
	 * 
	 * 面向对象编程可以帮助我们分散处理,避免处理过于集中。但是将一些业务处理分散在各个类中,
	 * 需求修改时不利于组件的复用。该分散时分散,该集中是集中。
	 */
}
