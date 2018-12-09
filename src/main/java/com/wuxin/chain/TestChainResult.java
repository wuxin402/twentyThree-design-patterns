package com.wuxin.chain;

/**
 * Client角色
 * @author Administrator
 *
 */
public class TestChainResult {
	public static void main(String[] args) {
		Support alice = new NoSupport("Alice");
		Support bob = new LimitSupport("Bob", 100);
		Support charlie = new SpecialSupport("Charlie", 429);
		Support diana = new LimitSupport("Dinana", 200);
		Support elmo = new OddSupport("Elmo");
		Support fred = new LimitSupport("Fred", 300);
		// 形成职责链
		alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
		// 制造各种问题
		for (int i = 0; i < 500; i += 33) {
			alice.support(new Trouble(i));
		}
	}
	
	/**
	 * Chain of Responsibility模式的最大优点就在于弱化了发出请求的人(Client角色)和处理请求
	 * 的人(ConcreteHandler角色)之间的关系
	 * Client角色向第一个ConcreteHandler角色发出请求,然后请求会在职责链中传播,直到某个
	 * ConcreteHandler角色处理该请求
	 * 
	 * 使用Chain of Responsibility模式,通过委托推卸责任,就可以根据情况变化动态地重组职责链。
	 * 如果固定写明"某个请求需要谁处理"这样的对应关系,那么很难在程序运行中去改变请求的处理者
	 * 
	 * 例如:在视窗系统中,用户有时需要可以自由地在视窗中添加控件
	 * 
	 * 缺点:如果职责链太长,会导致处理请求发生了延迟
	 */
}
