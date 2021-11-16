package com.bridgelabz.linkedlist;

public class LinkedList implements LinkedListInterface {
	Node head;

	@Override
	public void insert(int data) {
		// TODO Auto-generated method stub
		Node node = new Node();
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
	public void show() {
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
