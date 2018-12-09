package com.wuxin.visitor;

import java.util.Iterator;

/**
 * ConcreteVisitor(具体的访问者)
 * 负责实现Visitor角色所定义的接口
 * @author Administrator
 *
 */
public class ListVisitor extends Visitor{
	private String currentdir = "";
	
	@Override
	public void visit(File file) {
		System.out.println(currentdir + "/" +file);
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(currentdir + "/" +directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" +directory.getName();
		Iterator it = directory.iterator();
		while (it.hasNext()) {
				Entry entry = (Entry)it.next();
				entry.accept(this);
		}
		currentdir = savedir;
	}

} 
