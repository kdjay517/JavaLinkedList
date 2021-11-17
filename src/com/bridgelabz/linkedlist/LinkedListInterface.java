package com.bridgelabz.linkedlist;

public interface LinkedListInterface {
	
	public Node Insert(int data);
	public void Append(int data);
	public void insertAt(int index,int data);
	public Node pop();
	public int  popLast ();
	public void findNode(int value);
	public void Show();
}