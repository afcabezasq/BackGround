package com.revature.stack;

import java.util.Vector;

public class MyStack<E> extends Vector<E> {
	
	/*
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	
	/*
	 * determines if the stack is empty
	 * 
	 */
	public boolean empty() {
		return elementCount==0;
	}
	
	
	/*
	 * top of the stack withput removing
	 */
	public E peek() {
		
		return lastElement();
		
		
	}
	
	/*
	 * Removes the object from the top of the stack and returns that object
	 */
	
	public E pop() {
		return remove(elementCount-1);
	}
	
	/*
	 * Add an item to the top of the stack
	 */
	public E push(E item) {
		
		add(item);
		
		return item;
		
	}
	/*
	 * Return 1-based position indicaating where the object is on the stack
	 */
	
	public int search(Object o) {
		
		int index = indexOf(o);
		
		if(index==-1) {
			
			return -1;
			
		}
		
		return elementCount-index;
		
		
	}
	
	public static void main(String[] args) {
		
		MyStack<String> stack = new MyStack<>();
		
		stack.push("red");
		stack.push("orange");
		stack.push("yellow");
		System.out.println(stack);
//		System.out.println(stack.isEmpty());
		
		String element = stack.pop();
		System.out.println(element);
		element = stack.pop();
		System.out.println(element);
		
		System.out.println(stack);
		
	}
	
	

}
