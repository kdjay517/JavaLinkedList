package com.bridgelabz.linkedlist;

public interface LinkedListInterface {
	
	public Node Insert(int data);
	public void Append(int data);
	public void Show();
	public void insertAt(int index,int data);
	public Node pop();
	public int  popLast ();
	
}