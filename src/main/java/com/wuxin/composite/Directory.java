package com.wuxin.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 表示容器的角色.可以在其中放入Leaf角色和Composite角色
 * @author Administrator
 *
 */
public class Directory extends Entry{
	private String name;
	private List<Entry> directory = new ArrayList<Entry>();
	
	public Directory(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator it =directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry)it.next();
			size += entry.getSize();
		}
		return size;
	}
	public Entry add (Entry entry) {
		directory.add(entry);
		return this;
	}
	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" +this);
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.printList(prefix + "/" +name);
		}
	}

}
