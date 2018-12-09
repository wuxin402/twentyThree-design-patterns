package com.wuxin.abstracts.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的零件:Tray类
 * @author Administrator
 *
 */
public abstract class Tray extends Item{
	protected List<Item> tray = new ArrayList<Item>();
	
	public Tray(String caption) {
		super(caption);
	}
	
	public void add(Item item) {
		tray.add(item);
	}

}
