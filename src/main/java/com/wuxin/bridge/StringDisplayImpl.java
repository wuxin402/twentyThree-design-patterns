package com.wuxin.bridge;

/**
 * 类的实现层次结构:StringDisplayImpl类
 * ConreteImplementor(具体实现者)
 * 该角色负责实现在Implementor角色中定义的接口
 * @author Administrator
 *
 */
public class StringDisplayImpl extends DisplayImpl{
	private String word;
	private int width;
	public StringDisplayImpl(String word) {
		this.word = word;
		this.width = word.getBytes().length;
	}
	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + word + "|");
	}

	@Override
	public void rawClose() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		for (int i=0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
