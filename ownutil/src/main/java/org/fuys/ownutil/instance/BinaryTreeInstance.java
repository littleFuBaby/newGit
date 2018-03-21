package org.fuys.ownutil.instance;

import java.util.Arrays;

class Book implements Comparable<Book> {
	private String title;
	private double price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	@Override
	public int compareTo(Book book) {
		if (this.price > book.price) {
			return -1;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Title : " + this.title + " -- price : " + this.price;
	}
}

class BinaryTree {

	private Node root;

	private int count;
	private int foot;
	private Book[] books;

	public BinaryTree() {
	}

	private class Node {
		
		private Comparable<Book> book;
		private Node left;
		private Node right;

		public Node(Comparable<Book> book) {
			this.book = book;
		}

		public void addNode(Node node) {
			if (this.book.compareTo((Book) node.book) > 0) {
				if (this.left != null) {
					this.left.addNode(node);
				} else {
					this.left = node;
				}
			} else {
				if (this.right != null) {
					this.right.addNode(node);
				} else {
					this.right = node;
				}
			}
		}
		public void toArrayNode(){
			if(this.left!=null){
				this.left.toArrayNode();
			}
			BinaryTree.this.books[BinaryTree.this.foot++] = (Book) this.book;
			if(this.right!=null){
				this.right.toArrayNode();
			}
		}
	}

	public void add(Comparable<Book> book) {
		Node newNode = new Node(book);
		if (this.root == null) {
			this.root = newNode;
		} else {
			this.root.addNode(newNode);
		}
		this.count++;
	}

	public Book[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.books = new Book[this.count];
		this.foot = 0;
		this.root.toArrayNode();
		return this.books;
	}

}

public class BinaryTreeInstance {
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.add(new Book("JAVA", 13));
		tree.add(new Book("JSP", 33));
		tree.add(new Book("oracle", 63));
		tree.add(new Book("JAVA", 13));
		
		Book books[] = tree.toArray();
		System.out.println(Arrays.toString(books));
		
	}

}
