package com.wuxin.iterator;

/**
 * Iterator模式
 * 书架
 * @author Administrator
 *
 */
public class BookShelf implements Aggregate{
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		books[last] = book;
		this.last++;
	}
	
	public int getLength () {
		return last;
	}

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
