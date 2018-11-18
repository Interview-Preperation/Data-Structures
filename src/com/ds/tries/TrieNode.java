package com.ds.tries;

public class TrieNode {
	public TrieNode[] children = new TrieNode[26];
	public boolean endOfWord;
	public String content;
	
	TrieNode(){
		endOfWord = false;
		for(int i = 0; i < 26; i++){
			children[i] = null;
		}
	}
}
