package com.ds.trees;

public class LCAinBT {
	Node root;
	LCAinBT(int key){
		root = new Node(key);
	}
	
	Node findLCA(Node node, int n1, int n2){
		if(node == null){
			return null;
		}
		if(node.data == n1 || node.data == n2){
			return node;
		}
		
		Node leftChild = findLCA(node.left, n1, n2);
		Node rightChild = findLCA(node.right, n1, n2);
		
		if(leftChild != null && rightChild != null){
			return node;
		}
		
		return (leftChild != null) ? leftChild : rightChild;
	}
}
