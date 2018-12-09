package com.wuxin.observer;

/**
 * 具体的观察者
 * @author Administrator
 *
 */
public class GraphObserver implements Observer{

	public void update(NumberGenerator generator) {
		System.out.println("GraphObserver:");
		int count = generator.getNumber();
		for (int i = 0; i < count; i++) {
			System.out.println("*");
		}
		System.out.println("");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
