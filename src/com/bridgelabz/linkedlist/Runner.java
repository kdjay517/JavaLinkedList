package com.bridgelabz.linkedlist;

public class Runner {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		Node firstNode = new Node(56);
		Node secondNode = new Node(70);
		Node thirdNode = new Node(30);
		Node head = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		Node tail = thirdNode;
		
		Node temp = head;
		System.out.print("LinkedList:");
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
		

	}

}
