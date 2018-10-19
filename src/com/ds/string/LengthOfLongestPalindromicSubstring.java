package com.ds.string;

public class LengthOfLongestPalindromicSubstring {

	private static String findLength(String str) {
		if(str.length() < 2){
			return str;
		}
		int maxlength = 0;
		int start = 0;
		
		for(int i = 1; i < str.length(); i++){
			int low = i-1;
			int high = i;
			
			while(low >=0 && high < str.length() && str.charAt(high) == str.charAt(low)){
				if(high - low + 1 > maxlength){
					maxlength = high - low + 1;
					start = low;
				}
				high++;
				low--;
			}
			
			low = i-1;
			high = i+1;
			
			while(low >=0 && high < str.length() && str.charAt(high) == str.charAt(low)){
				if(high - low + 1 > maxlength){
					maxlength = high - low + 1;
					start = low;
				}
				high++;
				low--;
			}
		}
		
		return str.substring(start, maxlength);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLength("geeksskeeg"));
	}

}
