package com.Vector__Stack;

import java.util.Stack;

public class Stack_Methods {
	public static void constructor() {
		//public Stack() {}
		//public boolean empty()
		Stack s=new Stack();//empty stack
		System.out.println(s.size()+"+"+s.capacity());//0+10
		System.out.println(s.empty());//true
		s.setSize(5);
		System.out.println(s.size()+"+"+s.capacity());//5+10
		System.out.println(s.empty());//false
		System.out.println(s);
	}
	public static void push() {
		//public E push(E item)                    //add new Element
		//public synchronized E pop()              //retrive and delete last Added element
		//public synchronized E peek()             //retrive last Added element
		//public synchronized int search(Object o) //it counts from last added element
		Stack s=new Stack();//empty stack
		System.out.println(s.size()+"+"+s.capacity());//0+10
		System.out.println(s.push(2));//2
		System.out.println(s.push(3));//3
		System.out.println(s.push(4));//4
		System.out.println(s.push(5));//5
		System.out.println(s.size()+"+"+s.capacity());//4+10
		System.out.println(s);//[2, 3, 4, 5]
		System.out.println(s.pop());//5  (LIFO) or (FILO) removes
		System.out.println(s.size()+"+"+s.capacity());//3+10
		System.out.println(s);//[2, 3, 4]
		System.out.println(s.peek());//4   //not removes
		System.out.println(s.size()+"+"+s.capacity());//3+10
		System.out.println(s);//[2, 3, 4] 
		System.out.println(s.search(4));//1 (LIFO count)
		System.out.println(s.search(5));//-1 (If not found)
	}
	public static void main(String[] args) {
		//constructor();//empty();
		//push();//pop();//peek();//search();
	}
}
