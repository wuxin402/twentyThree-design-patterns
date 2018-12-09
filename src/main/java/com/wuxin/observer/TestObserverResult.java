package com.wuxin.observer;

public class TestObserverResult {
	public static void main(String[] args) {
		NumberGenerator generator = new RandomNumberGenerator();
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.execute();
	}
	
	/**
	 * 具体的观察者注册到subject,通过调用subject的execute方法,通知到观察者,执行每个
	 * 观察者的方法
	 */
}
