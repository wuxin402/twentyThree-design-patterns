package com.wuxin.template.method;

public class StringDisplay extends AbstractDisplay{
	private String words;
	private int width;
	public StringDisplay(String words) {
		this.words = words;
		this.width = words.getBytes().length;
	}
	
	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + words + "|");
	}

	@Override
	public void close() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		for (int i = 0;i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
