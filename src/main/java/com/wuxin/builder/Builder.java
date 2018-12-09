package com.wuxin.builder;

/**
 * Builder类是一个声明了编写文档的方法的抽象类
 * Builder角色负责定义用于生成实例的接口(API)
 * @author Administrator
 *
 */
public abstract class Builder {
	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
}
