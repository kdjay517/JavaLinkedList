package com.bridgelabz.linkedlist;

public class LinkedList implements LinkedListInterface {
	Node head;

	@Override
	public void Insert(int data) {
		// TODO Auto-generated method stub
		Node node = new Node(data);
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		Node node = head;
		System.out.print("LinkedList:");
		while (node.next != null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.print(node.data);
	}

}
