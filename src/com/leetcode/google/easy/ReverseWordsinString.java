package com.leetcode.google.easy;

public class ReverseWordsinString {

	public static String reverseWords(String str) {
		String[] arr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String st : arr) {
			sb = sb.append(reverse(st)).append(" ");
		}
		return sb.toString().trim();
	}

	public static String reverse(String str) {
		int i = 0, j = str.length() - 1;
		char[] strArray = str.toCharArray();
		while (i < j) {
			char temp = strArray[i];
			strArray[i] = strArray[j];
			strArray[j] = temp;
			i++;
			j--;
		}
		return new String(strArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Let's take LeetCode contest";
		String expected = "s'teL ekat edoCteeL tsetnoc";
		System.out.println(expected.equals(reverseWords(str)));
	}

}
