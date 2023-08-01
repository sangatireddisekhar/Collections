package com.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 * @author RS
 *
 */
public class List_Methods {
	public static void main(String[] args) {/////*****10 methods****
		//add();//addAll();
		//get();//set();//remove();
		//indexOf();//lastIndexOf();
		//subList();
		//listIterator();//listIterator(int);
	}
	public static void add() {
		//public void add(int index, E element) {
		//boolean addAll(int index, Collection<? extends E> c);
		List l=new ArrayList();
		Collection col=l;
		l.add("abc");
		l.add(123);
		System.out.println(l);//[abc, 123]
		l.add(0,"xyz");
		//l.add(4,"x");//RE:IOOBE
		l.add(3,"x");
		System.out.println(l);//[xyz, abc, 123, x]
		System.out.println(l.addAll(3,col));//true
		System.out.println(l);//[xyz, abc, 123, xyz, abc, 123, x, x]
	}
	public static void get() {
		//E get(int index);
		//E set(int index, E element);
		//E remove(int index);
		/*	List l=List.of("abc","aa",123);  dont modify the data
		//l.add("abc");RE:UnsupportedOperationException
		System.out.println(l);//[abc, aa, 123]
		String s=(String) l.get(1);
		System.out.println(s);//aa
		//System.out.println(l.get(2));//123

		System.out.println(l.set(1, "xyz"));//RE:UOE   */
		List l=new ArrayList();
		l.add("abc");
		l.add("ab");
		l.add("a");
		System.out.println(l);//[abc, ab, a]
		System.out.println(l.get(1));//ab
		System.out.println(l);//[abc, ab, a]
		System.out.println();
		System.out.println(l.set(2, "3a"));//a
		System.out.println(l);//[abc, ab, 3a]
		System.out.println(l.remove(2));//3a
		System.out.println(l);//[abc, ab]
	}
	public static void indexOf() {
		//int indexOf(Object o);
		//int lastIndexOf(Object o);
		List l=List.of("abc","aa",123,1,'a',"aa",1);
		System.out.println(l.indexOf("aa"));//1
		System.out.println(l.indexOf(1));//3
		System.out.println(l.indexOf("ab"));//-1  (If not found)
		System.out.println(l.lastIndexOf(1));//6
		System.out.println(l.lastIndexOf("aa"));//5
		System.out.println(l.lastIndexOf("aab"));//-1
	}
	public static void subList() {
		//List<E> subList(int fromIndex, int toIndex);
		List l1=List.of("abc","aa",123,1,'a',"aa",1);
		System.out.println(l1);//[abc, aa, 123, 1, a, aa, 1]
		List l2=l1.subList(2, 4);  //2  to 4-1
		System.out.println(l2);//[123, 1]
	}
	public static void listIterator() {
		//ListIterator<E> listIterator();
		//ListIterator<E> listIterator(int index);
		List l=List.of("abc","aa",123,1,'a',"aa",1);
		System.out.println(l);//[abc, aa, 123, 1, a, aa, 1]
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		li=l.listIterator(3);  //it reads from given index to last
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}
	
}
