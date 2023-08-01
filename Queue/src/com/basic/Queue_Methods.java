package com.basic;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Methods {
	public static void add() {
		//boolean add(E e);   //adding new Element to queue
		//boolean offer(E e); //            ''
		//E remove();         //retrive and remove (FIFO) first added element
		//E poll();           //              ''
		//E element();        //retrive first element everytime
		//E peek();           //              ''
		Queue q= new LinkedList();
		System.out.println(q.size());//0
		System.out.println(q.add(4));//true
		System.out.println(q.add(2));//true
		System.out.println(q.add(6));//true
		System.out.println(q);//[4, 2, 6]
		System.out.println(q.offer('a'));//true
		System.out.println(q.offer(10));//true
		System.out.println(q);//[4, 2, 6, a, 10]
		
		System.out.println(q.remove());//4 (FIFO)
		//System.out.println(q.remove());//2  (FIFO)
		System.out.println(q);//[2, 6, a, 10]
		System.out.println(q.poll());//2   (FIFO)
		//System.out.println(q.poll());//6
		System.out.println(q);//[6, a, 10]
		
		System.out.println(q.element());//6
		System.out.println(q.element());//6
		System.out.println(q);//[6, a, 10]
		System.out.println(q.peek());//6
		System.out.println(q.peek());//6
		System.out.println(q);//[6, a, 10]
	}
	public static void main(String[] args) {
		//add();//offer();     //remove();//poll();     //element();//peek();
	}
}
