package com.ds.stack;

import java.util.Stack;

public class MinStack {

	private Stack<Integer> s1 = null;
	private Stack<Integer> s2 = null;

	public MinStack() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}

	private void push(int x) {
		s1.push(x);
		if (s2.isEmpty()) {
			s2.push(x);
		} else if (x < (int) s2.peek()) {
			s2.push(x);
		}
	}

	private int pop() throws Exception {
		if (s1.isEmpty()) {
			throw new Exception();
		}

		if (s1.peek().equals(s2.peek())) {
			s1.pop();
			return s2.pop();
		}

		return s1.pop();
	}

	private int top() throws Exception {
		if (s1.isEmpty()) {
			throw new Exception();
		}

		return s1.pop();
	}

	private int getMin() throws Exception {
		if (s2.isEmpty()) {
			throw new Exception();
		}

		return s2.peek();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(3);
		minStack.push(5);
		minStack.push(7);
		System.out.println(minStack.getMin());
		System.out.println(minStack.top());
	}

}
