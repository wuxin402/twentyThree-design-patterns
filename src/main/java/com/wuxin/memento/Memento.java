package com.wuxin.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Memento(纪念品)
 * @author Administrator
 *
 */
public class Memento {
	int money;
	ArrayList fruits;
	
	public int getMoney() {
		return money;
	}
	
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList();
	}
	
	void addFruit(String fruit) {
		fruits.add(fruit);
	}
	
	List getFruits() {
		return (List) fruits.clone();
	}
}
