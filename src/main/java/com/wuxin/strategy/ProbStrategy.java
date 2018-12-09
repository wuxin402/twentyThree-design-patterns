package com.wuxin.strategy;

import java.util.Random;

/**
 * 负责实现具体的策略(战略,方向,方法和算法)
 * @author Administrator
 *
 */
public class ProbStrategy implements Strategy{
	private Random random;
	private int prevHandValue = 0;
	private int currentHandValue = 0;
	private int[][] history = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
	};
	
	public ProbStrategy(int seed) {
		random = new Random(seed);
	}

	public Hand nextHand() {
		// TODO Auto-generated method stub
		return null;
	}

	public void study(boolean win) {
		// TODO Auto-generated method stub
		
	}

}
