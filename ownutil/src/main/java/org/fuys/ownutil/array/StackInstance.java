package org.fuys.ownutil.array;

import java.util.Enumeration;
import java.util.Stack;

public class StackInstance {

	public static void main(String[] args) {

		// Stack
		// push()
		Stack<String> stack = new Stack<>();
		stack.push("0-andy");
		stack.push("1-andy");
		stack.push("2-andy");
		stack.push("3-andy");
		stack.push("4-andy");

		// Enumeration
		Enumeration<String> enumeration = stack.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		// pop()
		int size = stack.size();
		System.out.println("original size:" + stack.size() + " --- stack:" + stack);
		for (int x = 0; x < size; x++) {
			System.out.println("pop:" + stack.pop());
			System.out.println("size:" + stack.size());
		}
	}

}
