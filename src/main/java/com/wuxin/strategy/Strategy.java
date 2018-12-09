package com.wuxin.strategy;

/**
 * 定义了猜拳策略的抽象方法
 * @author Administrator
 *
 */
public interface Strategy {
	public abstract Hand nextHand();
	public abstract void study(boolean win);
}
