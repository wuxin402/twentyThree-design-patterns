package com.wuxin.composite;

/**
 * Leaf(树叶)
 * 表示"内容"的角色。在该角色中不能放入其他对象
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

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" +this);
	}

}
