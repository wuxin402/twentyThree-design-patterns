package com.wuxin.iterator;

/**
 * Iterator模式
 * 遍历集合的接口
 * @author Administrator
 *
 */
public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}
