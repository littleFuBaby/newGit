package org.fuys.ownutil.instance;

import java.util.Calendar;

class Point {
	private String content;
	private Point next;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Point getNext() {
		return next;
	}

	public void setNext(Point next) {
		this.next = next;
	}

	public Point(String content) {
		this.content = content;
	}

	public boolean addPoint(String content) {
		if (this.getNext() == null) {
			this.next = new Point(content);
			return true;
		}
		addPoint(content);
		return false;
	}

	public void printPoint(Point point) {
		if (point == null) {
			return;
		}
		System.out.println(point.getContent());
		printPoint(point.getNext());
	}

}

class Link {

	private Point root;

	public Point getRoot() {
		return root;
	}

	public void setRoot(Point root) {
		this.root = root;
	}

	public Link() {
	}

	public boolean add(String content) {
		if (this.root == null) {
			this.root = new Point(content);
			return true;
		}
		this.root.addPoint(content);
		return false;
	}

	public void print() {
		if (this.root == null) {
			return;
		}
		this.root.printPoint(this.root);
	}
}

public class LinkInstance {
	public static void main(String[] args) {

		Calendar.getInstance();
		Link link = new Link();
		link.add("root");
		link.add("p2");
		link.add("p3");
		link.print();
	}
}
