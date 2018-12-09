package com.wuxin.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ConcreteElement
 * 负责实现Element角色所定义的接口
 * @author Administrator
 *
 */
public class Directory extends Entry{
	private String name;
	private List dir =new ArrayList();
	public Directory(String name) {
		this.name = name;
	}
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator it = dir.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry)it.next();
			size += entry.getSize();
		}
		return size;
	}
	
	public Entry add(Entry entry) {
		dir.add(entry);
		return this;
	}
	
	public Iterator iterator() {
		return dir.iterator();
	}
}
