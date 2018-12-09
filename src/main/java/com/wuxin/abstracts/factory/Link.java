package com.wuxin.abstracts.factory;

/**
 * 抽象的零件:Link类
 * @author Administrator
 *
 */
public abstract class Link extends Item{
	protected String url;
	public Link(String caption,String url) {
		super(caption);
		this.url = url;
	}

}
