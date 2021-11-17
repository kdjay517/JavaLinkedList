package com.bridgelabz.linkedlist;

public class Operations {
	LinkedList list = new LinkedList();

	public void addDataAtStart() {
		list.Insert(70);
		list.Insert(30);
		list.Insert(56);
		list.Show();
	}

	public void addDataAtEnd() {
		list.Append(56);
		list.Append(30);
		list.Append(70);
		list.Show();
	}

	public void addDataAtMiddle() {
		list.Insert(70);
		list.Insert(56);
		list.insertAt(1, 30);
		list.Show();
	}
	
	public void deleteFirstNode() {
        addDataAtStart();
        System.out.println("");
        Node deleteNode = list.pop();
        list.Show();

    }

}