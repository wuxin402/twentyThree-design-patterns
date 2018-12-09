package com.wuxin.observer;

import java.util.Random;

/**
 * ConcreteSubject(具体的观察对象)
 * @author Administrator
 *
 */
public class RandomNumberGenerator extends NumberGenerator{
	private Random random = new Random();
	private int number;
	
	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		for (int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
	}

}
