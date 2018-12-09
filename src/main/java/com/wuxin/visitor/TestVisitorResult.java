package com.wuxin.visitor;

public class TestVisitorResult {
	public static void main(String[] args) {
		System.out.println("Making root entries...");
		Directory rootdir = new Directory("root");
		Directory bindir = new Directory("bin");
		Directory tmpdir = new Directory("tmp");
		Directory usrdir = new Directory("usr");
		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(usrdir);
		bindir.add(new File("vi",10000));
		bindir.add(new File("latex",20000));
		rootdir.accept(new ListVisitor());
	}
	
	/**
	 * Visitor模式的目的是将处理从数据结构中分离出来。
	 * 数据结构可以将元素集合和数据关联在一起。保存数据结构与以数据结构为基础进行处理是两种不同的东西。
	 * 
	 * 开闭原则:对扩展开放,对修改关闭
	 * 在不修改现有代码的前提下进行扩展功能就是开闭原则
	 */
}
