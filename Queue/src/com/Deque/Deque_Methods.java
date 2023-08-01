package com.Deque;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Deque_Methods {
	public static void addFirst() {
		//void addFirst(E e);
		//void addLast(E e);
		//boolean offerFirst(E e);
		//boolean offerLast(E e);
		//boolean addAll(Collection<? extends E> c);
		List c=List.of(4,2,5,6,8);
		//Deque dq=new LinkedList(c);
		Deque dq=new LinkedList();
		dq.addAll(c);
		System.out.println(dq.size()+"="+dq);//5=[4, 2, 5, 6, 8]
		dq.addFirst(1);
		dq.addFirst(9);
		System.out.println(dq.size()+"="+dq);//7=[9, 1, 4, 2, 5, 6, 8]
		dq.addLast("a");
		dq.addLast("b");
		System.out.println(dq.size()+"="+dq);//9=[9, 1, 4, 2, 5, 6, 8, a, b]
		System.out.println(dq.offerFirst(7));//true
		System.out.println(dq.size()+"="+dq);//10=[7, 9, 1, 4, 2, 5, 6, 8, a, b]
		System.out.println(dq.offerLast("c"));//true
		System.out.println(dq.size()+"="+dq);//11=[7, 9, 1, 4, 2, 5, 6, 8, a, b, c]
	}
	public static void removeFirst() {
		//E removeFirst();
		//E removeLast();
		//E pollFirst();
		//E pollLast();
		List c=List.of(4,2,5,6,8);
		Deque dq=new LinkedList(c);
		System.out.println(dq.size()+"="+dq);//5=[4, 2, 5, 6, 8]
		System.out.println(dq.removeFirst());//4
		System.out.println(dq.size()+"="+dq);//4=[2, 5, 6, 8]
		System.out.println(dq.removeLast());//8
		System.out.println(dq.size()+"="+dq);//3=[2, 5, 6]
		System.out.println(dq.pollFirst());//2
		System.out.println(dq.size()+"="+dq);//2=[5, 6]
		System.out.println(dq.pollLast());//6
		System.out.println(dq.size()+"="+dq);//1=[5]
	}
	public static void getFirst() {
		//E getFirst();    //retrives First element (if Queue if empty returns RE:)
		//E getLast();     //retrives Last element (if Queue if empty returns RE:)
		//E peekFirst();   //retrives First element (if Queue if empty returns null)
		//E peekLast();    //retrives Last element (if Queue if empty returns null)
		List c=List.of(4,2,5,6,8);
		Deque dq=new LinkedList(c);
		System.out.println(dq.size()+"="+dq);//5=[4, 2, 5, 6, 8]
		System.out.println(dq.getFirst());//4
		System.out.println(dq.getLast());//8
		System.out.println(dq.peekFirst());//4
		System.out.println(dq.peekLast());//8

		System.out.println(dq.removeAll(c));//true
		System.out.println(dq.size()+"="+dq);//0=[]
		//System.out.println(dq.getFirst());//RE:java.util.NoSuchElementException
		System.out.println(dq.peekFirst());//null
	}
	public static void removeFirstOccurrence() {
		//boolean removeFirstOccurrence(Object o);
		//boolean removeLastOccurrence(Object o);
		List c=List.of(2,5,2,6,5);
		Deque dq=new LinkedList(c);
		System.out.println(dq.size()+"="+dq);//5=[2, 5, 2, 6, 5]
		System.out.println(dq.removeFirstOccurrence(2));//true
		System.out.println(dq.size()+"="+dq);//4=[5, 2, 6, 5]
		System.out.println(dq.removeLastOccurrence(6));//true
		System.out.println(dq.size()+"="+dq);//3=[5, 2, 5]
		System.out.println(dq.removeLastOccurrence(7));//false (If not found)
	}
	public static void remove() {
		//boolean remove(Object o);  //it works as a removeFirstOccurrence(ob);
		//boolean contains(Object o);
		List c=List.of(2,5,2,6,5);
		Deque dq=new LinkedList(c);
		System.out.println(dq.size()+"="+dq);//5=[2, 5, 2, 6, 5]
		System.out.println(dq.remove(5));//true
		System.out.println(dq.size()+"="+dq);//4=[2, 2, 6, 5]
		System.out.println(dq.contains(6));//true
	}
	public static void iterator() {
		//Iterator<E> iterator();
		//Iterator<E> descendingIterator();
		List c=List.of(4,2,5,6,8);
		Deque dq=new LinkedList(c);
		System.out.println(dq.size()+"="+dq);//5=[4, 2, 5, 6, 8]
		Iterator i1=dq.iterator();
		while(i1.hasNext()) {
			int a=(int) i1.next();
			System.out.println(a);//4 2 5 6 8
		}
		Iterator i2=dq.descendingIterator();
		while(i2.hasNext()) {
			int a=(int) i2.next();
			System.out.println(a);//8 6 5 2 4
		}

	}
	public static void main(String[] args) {
		//size();
		//addFirst();//addLast();         //offerFirst();//offerLast();
		//removeFirst();//removeLast();   //pollFirst();//pollLast();
		//getFirst();//getLast();           //peekFirst();//peekLast();
		//removeFirstOccurrence();
		//Stack methods 1.push 2.pop
		//remove();//contains();

		//iterator();//descendingIterator();
	}
}
