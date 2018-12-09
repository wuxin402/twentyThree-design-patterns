package com.wuxin.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Subject(观察对象)
 * 定义了注册观察者和删除观察者的方法
 * @author Administrator
 *
 */
public abstract class NumberGenerator {
	private List observers = new ArrayList();
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		Iterator it = observers.iterator();
		while (it.hasNext()) {
			Observer o = (Observer)it.next();
			o.update(this);
		}
	}
	
	public abstract int getNumber();
	public abstract void execute();
}
