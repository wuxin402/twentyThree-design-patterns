package com.wuxin.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Originator(生成者)
 * @author Administrator
 *
 */
public class Gamer {
	private int money;
	private List fruits = new ArrayList();
	private Random random = new Random();
	
	private static String[] fruitsname = {
		"苹果","葡萄","香蕉","橘子"	
	};
	
	public Gamer(int money) {
		this.money = money;
	}
}
