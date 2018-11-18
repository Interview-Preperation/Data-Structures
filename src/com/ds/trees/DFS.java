package com.ds.trees;

import java.util.Stack;

public class DFS {

	public static void DFSBT(Node root){
		if(root == null){
			return;
		}
		
		Stack<Node> stack = new Stack<>();		
		stack.add(root);
		
		while(!stack.isEmpty()){
			Node node= stack.pop();
			System.out.println(node.data + " ");
			if(node.left!=null)
				stack.push(node.left);
			if(node.right!=null)
				stack.push(node.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		DFSBT(root);
	}

}
