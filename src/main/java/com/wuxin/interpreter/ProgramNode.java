package com.wuxin.interpreter;

public class ProgramNode extends Node{
	private Node commandListNode;
	@Override
	public void parse(Context context) throws ParseException {
	}
	@Override
	public String toString() {
		return "ProgramNode [commandListNode=" + commandListNode + "]";
	}
	
}
