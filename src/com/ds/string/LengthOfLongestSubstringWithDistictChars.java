package com.ds.string;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringWithDistictChars {

	private static int findLength(String str) {
		if (str == null) {
			return 0;
		}
		int i = 0, j = 0, maxlength = 0;
		Set<Character> set = new HashSet<>();
		while(i < str.length() && j < str.length()){
			if(!set.contains(str.charAt(j))){
				set.add(str.charAt(j++));
				maxlength = Math.max(maxlength, j - i);
			} else {
				set.remove(str.charAt(i++));
			}
		}
		return maxlength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLength("bbbbb"));
	}

}
