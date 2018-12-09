package com.wuxin.iterator;

/**
 * Iterator模式
 * 测试最终结果
 * @author Administrator
 *
 */
public class TestIterator {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Think in Java"));
		bookShelf.appendBook(new Book("jiayou wuxin"));
		bookShelf.appendBook(new Book("spark"));
		bookShelf.appendBook(new Book("spark sql"));
		Iterator iterator = bookShelf.iterator();
		while(iterator.hasNext()) {
			Book book = (Book)iterator.next();
			System.out.println(book.getName());
		}
	}
	
	/**
	 * 1、为什么要引入Iterator模式,而不是直接用for循环遍历?
	 * 	这样做主要是为了将遍历与实现分离开来,不管以后BookShelf后期放弃数组来管理书,都不会影响到遍历,对于BookShelf的调用
	 * 者来说真的太方便了。
	 * 2、设计模式的作用?
	 * 	设计模式的作用就是帮助我们编写可复用的类,所谓"可复用",就是指将类实现为"组件",当一个组件发生改变时,
	 * 不需要对其他的组件进行修改或是只需要很小的修改即可应对。
	 * 3、为什么要用抽象类和接口
	 * 	如果只使用具体的类来解决问题,很容易导致类之间的强耦合,这些类也难以作为组件被再次利用。为了弱化类之间的耦合,进而使得类
	 * 更加容易作为组件被再次利用,我们需要引入抽象类和接口
	 */
}
