package com.wuxin.composite;

/**
 * 表示目录条目的抽象类
 * 使Leaf角色和Composite角色具有一致性的角色。Component角色是Leaf角色和Composite角色的父类
 * @author Administrator
 *
 */
public abstract class Entry {
	public abstract String getName();
	public abstract int getSize();
	
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}
	
	public void printList () {
		printList("");
	}
	
	protected abstract void printList(String prefix);
	
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
