package com.wuxin.composite;

public class TestCompositeResult {
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
		rootdir.printList();
	}
	
	/**
	 * 使用Composite模式可以使容器与内容具有一致性,也可以称其为多个和单个的一致性,即将
	 * 多个对象结合在一起,当作一个对象进行处理,递归结构那种
	 * Entry类中定义了add方法,所做的处理是抛出异常,这是因为能使用add方法的只能是Directory类。
	 */
}
