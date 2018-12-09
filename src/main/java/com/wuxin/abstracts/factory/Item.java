package com.wuxin.abstracts.factory;

/**
 * 抽象的零件:Item类
 * @author Administrator
 *
 */
public abstract class Item {
	protected String caption;
	public Item(String caption) {
		this.caption = caption;
	}
	public abstract String makeHTML();
}
