package com.wuxin.decorator;

/**
 * ConcreteComponent
 * @author Administrator
 *
 */
public class StringDisplay extends Display{
	private String word;
	public StringDisplay (String word) {
		this.word = word;
	}
	@Override
	public int getColumns() {
		return word.getBytes().length;
	}

	@Override
	public int getRows() {
		return 1;
	}

	@Override
	public String getRowText(int row) {
		if (row == 0) {
			return word;
		} else {
			return null;
		}
	}

}
