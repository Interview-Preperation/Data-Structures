package com.ds.stack;

import java.util.Stack;

public class EvaluateExpression {

	private static int evaluate(String[] arr) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "4", "13", "5", "/", "+" };
		System.out.println(evaluate(arr));
	}

}
