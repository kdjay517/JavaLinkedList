package com.bridgelabz.linkedlist;


public class LinkedList implements LinkedListInterface {
	Node head;
	Node tail;

	@Override
	public Node Insert(int data) {
		// TODO Auto-generated method stub
		Node node = new Node(data);
		node.data = data;
		node.next = null;

		if (head == null) {
			this.head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		return node;
	}

	@Override
	public void Append(int data) {
		// TODO Auto-generated method stub
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			Node temp = tail;
			this.tail = node;
			temp.next = node;
		}
	}

	@Override
	public void insertAt(int index, int data) {
		// TODO Auto-generated method stub
		Node node = new Node(data);
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	@Override
	public Node pop() {
		// TODO Auto-generated method stub
		Node temp = this.head;
		this.head = this.head.next;
		return temp;
	}

	@Override
	public int popLast() {
		// TODO Auto-generated method stub
		if (head == null) {
			System.out.println("List is empty, hence deletion is not possible");
		}
		if (head.next == null) {
			Node temp = head;
			head = null;
			return temp.data;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		int data = temp.next.data;
		temp.next = null;
		return data;
	}

	@Override
	public void findNode(int value) {
		// TODO Auto-generated method stub
		Node tempNode = head;
		int index = 1;
		boolean flag = false;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (tempNode != null) {
				if (tempNode.data == value) {
					flag = true;
					break;
				}
				index++;
				tempNode = tempNode.next;
			}
		}
		if (flag == true) {
			System.out.println("Value:" + value + " is present at Index:" + index);
		} else {
			System.out.println("Element no present");
		}

	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		Node node = head;
		System.out.print("LinkedList:");
		while (node.next != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.print(node.data + "->");
		node = node.next;


	}

}
