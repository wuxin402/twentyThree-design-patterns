package com.wuxin.abstracts.factory;

/**
 * 具体的零件
 * @author Administrator
 *
 */
public class ListLink extends Link{
	
	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<li><a href>";
	}

}
