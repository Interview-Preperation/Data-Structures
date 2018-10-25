package com.ds.tries;

public class TrieImpl {

	static TrieNode root;
	
	static void insert(String key){
		int level = 0;
		TrieNode current = root;
		
		for(int i = level; i < key.length(); i++){
			int index = key.charAt(level) - 'a';
			if(current.children[index] == null){
				current.children[index] = new TrieNode();
			}
			current = current.children[index];
		}
		current.endOfWord = true;
	}
	
	static boolean search(String key){
		int level = 0;
		TrieNode current = root;
		
		for(int i = level; i < key.length(); i++){
			int index = key.charAt(level) - 'a';
			if(current.children[index] == null){
				return false;
			}
			current = current.children[index];
		}
		return current!=null && current.endOfWord;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
