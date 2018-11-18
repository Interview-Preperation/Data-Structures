package com.leetcode.google.easy;

public class ReverseString {
    public String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        
        while(i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        
        return new String(charArray);
    }
}
