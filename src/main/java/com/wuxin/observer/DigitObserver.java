package com.wuxin.observer;

/**
 * 具体的观察者
 * @author Administrator
 *
 */
public class DigitObserver implements Observer{

	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:" + generator.getNumber());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
