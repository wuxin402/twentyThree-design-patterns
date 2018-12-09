package com.wuxin.strategy;

import java.util.Random;

/**
 * 负责实现具体的策略(战略,方向,方法和算法)
 * @author Administrator
 *
 */
public class WinningStrategy implements Strategy{
	private Random random;
	private boolean won = false;
	private Hand preHand;
	public WinningStrategy(int seed) {
		random = new Random(seed);
	}

	public Hand nextHand() {
		if (!won) {
			preHand = Hand.getHand(random.nextInt(3));
		}
		return preHand;
	}

	public void study(boolean win) {
		won = win;
	}

}
