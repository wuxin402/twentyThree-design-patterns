package com.wuxin.prototype;

/**
 * Product接口是复制功能的接口
 * @author Administrator
 *
 */
public interface Product extends Cloneable{
	public abstract void use(String s);
	public abstract Product createClone();
}
