package com.leetcode.google.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String sorted = sort(strs[i]);
            List<String> temp = null;
            if(map.containsKey(sorted)) {
                temp = map.get(sorted);
                temp.add(strs[i]);
            } else {
                temp = new ArrayList<>();
                temp.add(strs[i]);
            }
            map.put(sorted, temp);
        }
        
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
    
    public String sort(String str) {
        char[] arr = str.toCharArray();
    	Arrays.sort(arr);
        return new String(arr);
    }
}
