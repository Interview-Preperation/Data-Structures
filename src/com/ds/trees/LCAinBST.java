package com.ds.trees;

public class LCAinBST {
	
	Node findLCA(Node node, int n1, int n2){
		if(node == null){
			return null;
		}
		
		if(node.data > n1 && node.data > n2){
			return findLCA(node.left, n1, n2);
		}
		
		if(node.data < n1 && node.data < n2){
			return findLCA(node.right, n1, n2);
		}
		
		return node;
	}
}
