package com.wuxin.abstracts.factory;

import java.util.Iterator;

/**
 * 具体的零件
 * @author Administrator
 *
 */
public class ListPage extends Page{

	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer =new StringBuffer();
		Iterator<Item> iterator = super.content.iterator();
		while(iterator.hasNext()) {
			Item item = (Item)iterator.next();
			buffer.append(item.makeHTML());
		}
		return buffer.toString();
	}

}
