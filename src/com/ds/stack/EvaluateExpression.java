package com.ds.stack;

import java.util.Stack;

public class EvaluateExpression {

	private static int evaluate(String[] arr) throws Exception {

		if (arr == null || arr.length < 3) {
			throw new Exception();
		}
		Stack<Integer> stack = new Stack<>();
		for (String string : arr) {
			if (!checkExpression(string))
				stack.push(Integer.parseInt(string));
			else {
				if (!stack.isEmpty()) {
					int a = stack.pop();
					int b = stack.pop();
					int result = 0;
					switch (string) {
					case "+":
						result = b + a;
						break;
					case "-":
						result = b - a;
						break;
					case "/":
						result = b / a;
						break;
					case "*":
						result = b * a;
						break;
					}
					stack.push(result);
				}
			}
		}
		return stack.peek();
	}

	private static boolean checkExpression(String s) {
		if (s == "+" || s == "-" || s == "/" || s == "*") {
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String arr[] = {};
		System.out.println(evaluate(arr));
	}

}
