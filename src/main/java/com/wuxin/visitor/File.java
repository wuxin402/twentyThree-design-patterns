package com.wuxin.visitor;

/**
 * ConcreteElement
 * 负责实现Element角色所定义的接口
 * @author Administrator
 *
 */
public class File extends Entry{
	private String name;
	private int size;
	public File(String name, int size) {
		this.name = name;
		this.size = size;
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
		return size;
	}

}
