package com.ds.linkedlist;

public class AddTwoNumbers {

	private static Node add(Node n1, Node n2) {

		if (n1 == null && n2 == null) {
			return null;
		}

		if (n1 == null) {
			return n2;
		}

		if (n2 == null) {
			return n1;
		}
		
		int carry = 0;
		int sum = 0;
		Node result = new Node(0);
		Node curr = result;

		while (n1 != null && n2 != null) {
			sum = (n1.getData() + n2.getData() + carry) % 10;
			carry = (n1.getData() + n2.getData() + carry) / 10;

			curr.setNextNode(new Node(sum));
			n1 = n1.getNextNode();
			n2 = n2.getNextNode();
			curr = curr.getNextNode();
		}

		while (n1 != null) {
			sum = (n1.getData() + carry) % 10;
			carry = (n1.getData() + carry) / 10;
			curr.setNextNode(new Node(sum));
			curr = curr.getNextNode();
			n1 = n1.getNextNode();
		}

		while (n2 != null) {
			sum = (n2.getData() + carry) % 10;
			carry = (n2.getData() + carry) / 10;
			curr.setNextNode(new Node(sum));
			curr = curr.getNextNode();
			n2 = n2.getNextNode();
		}
		
		if(carry > 0){
			curr.setNextNode(new Node(carry));
		}

		return result.getNextNode();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(2);
		n1.setNextNode(new Node(4));
		n1.getNextNode().setNextNode(new Node(9));

		Node n2 = new Node(5);
		n2.setNextNode(new Node(6));
		n2.getNextNode().setNextNode(new Node(4));

		Node result = add(n1, n2);

		while (result != null) {
			System.out.print(result.getData());
			System.out.print("->");
			result = result.getNextNode();
		}
		System.out.print("null");
	}

}
