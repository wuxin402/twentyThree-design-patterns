package com.wuxin.abstracts.factory;

import java.util.Iterator;

/**
 * 具体的零件
 * @author Administrator
 *
 */
public class ListTray extends Tray{

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer =new StringBuffer();
		Iterator<Item> iterator = super.tray.iterator();
		while(iterator.hasNext()) {
			Item item = (Item)iterator.next();
			buffer.append(item.makeHTML());
		}
		return buffer.toString();
	}

}
