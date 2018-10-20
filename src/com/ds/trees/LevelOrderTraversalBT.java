package com.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalBT {
	
	private static void LOT(Node root){
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node node = queue.remove();
			System.out.print(node.data + " ");
			if(node.left!=null)
				queue.add(node.left);
			if(node.right!=null)
			queue.add(node.right);
		}
	}
	
	private static void LOTLevelDisplay(Node root){
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			int size = queue.size();
			while(size > 0){
				Node node = queue.remove();
				System.out.print(node.data + " ");
				if(node.left!=null)
					queue.add(node.left);
				if(node.right!=null)
				queue.add(node.right);
				size--;
			}	
			System.out.println();
		}
	}
	
	public void inorderTraversal(Node root){
		if(root == null){
			return;
		}
		
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);
	}
	
	public void preorderTraversal(Node root){
		if(root == null){
			return;
		}

		System.out.println(root.data);
		inorderTraversal(root.left);
		inorderTraversal(root.right);
	}
	
	public void postorderTraversal(Node root){
		if(root == null){
			return;
		}

		inorderTraversal(root.left);
		inorderTraversal(root.right);
		System.out.println(root.data);
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
		
		LOT(root);		
		System.out.println();
		LOTLevelDisplay(root);
	}

}
