package com.Vector__Stack;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Methods {
	public static void isEmpty() {
		//public synchronized boolean isEmpty()
		//public synchronized int size()
		//public synchronized int capacity()
		//public synchronized void addElement(E obj)
		Vector v=new Vector();
		System.out.println(v.isEmpty());//true
		System.out.println(v.size());//0
		System.out.println(v.capacity());//10
		for (int i = 0; i <=10; i++) {
			v.addElement(i);
		}
		System.out.println(v.isEmpty());//false
		System.out.println(v.size());//11
		System.out.println(v.capacity());//20
	}
	public static void elementAt() {
		//public synchronized E elementAt(int index)
		//public synchronized E firstElement()
		//public synchronized E lastElement()
		Vector v=new Vector();
		for (int i = 0; i <=10; i++) {
			v.addElement((char)(97+i));
		}
		System.out.println(v);//[a, b, c, d, e, f, g, h, i, j, k]
		System.out.println(v.elementAt(2));//c
		char ch=(char) v.elementAt(3);
		System.out.println(v.get(2));//c  //List method
		System.out.println(v.firstElement());//a
		System.out.println(v.lastElement());//k
	}
	public static void insertElementAt() {
		//public synchronized void insertElementAt(E obj, int index)
		//public synchronized void setElementAt(E obj, int index) {
		Vector v=new Vector();
		for (int i = 0; i <=10; i++) {
			v.addElement(i);
		}
		System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        v.insertElementAt(50, 5);  
        System.out.println(v);//[0, 1, 2, 3, 4, 50, 5, 6, 7, 8, 9, 10]
        v.add(6, 51);  //List method
        System.out.println(v);//[0, 1, 2, 3, 4, 50, 51, 5, 6, 7, 8, 9, 10]
        v.setElementAt(52, 7);
        System.out.println(v);//[0, 1, 2, 3, 4, 50, 51, 52, 6, 7, 8, 9, 10]
        v.set(8, 53);  //List method
        System.out.println(v);//[0, 1, 2, 3, 4, 50, 51, 52, 53, 7, 8, 9, 10]
	}
	public static void removeElement() {
		//public synchronized boolean removeElement(Object obj) 
		//public synchronized void removeElementAt(int index) 
		//public synchronized void removeAllElements() 
		//protected synchronized void removeRange(int fromIndex, int toIndex)
		Vector v=new Vector();
		for (int i = 0; i <=10; i++) {
			v.addElement(i);
		}
		System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(v.removeElement(5));//true
		System.out.println(v);//[0, 1, 2, 3, 4, 6, 7, 8, 9, 10]
		v.removeElementAt(3);
		System.out.println(v);//[0, 1, 2, 4, 6, 7, 8, 9, 10]
		//v.removeRange(2,3);//it is protected
		v.removeAllElements();
		System.out.println(v);//[]
	}
	public static void trimToSize() {
		//public synchronized void trimToSize()
		//public synchronized void ensureCapacity(int minCapacity)
		//public synchronized void setSize(int newSize)
		Vector v=new Vector();
		for (int i = 0; i <=5; i++) {
			v.addElement(i);
		}
		System.out.println(v.size()+"+"+v.capacity());//6+10(intialCapacity)
		System.out.println(v);//[0, 1, 2, 3, 4, 5]
		v.ensureCapacity(25);
		System.out.println(v.size()+"+"+v.capacity());//6+25
		System.out.println(v);//[0, 1, 2, 3, 4, 5]
		v.setSize(10);
		System.out.println(v.size()+"+"+v.capacity());//10+25
		System.out.println(v);//[0, 1, 2, 3, 4, 5, null, null, null, null]
		v.trimToSize();
		System.out.println(v.size()+"+"+v.capacity());//10+10
		System.out.println(v);//[0, 1, 2, 3, 4, 5, null, null, null, null]
	}
	public static void elements() {
		//public Enumeration<E> elements()
		Vector v=new Vector();
		for (int i = 0; i <=5; i++) {
			v.addElement(i);
		}
		System.out.println(v);//[0, 1, 2, 3, 4, 5]
		Enumeration cursor=v.elements();
		//boolean hasMoreElements();
		//E nextElement();
		/*while(cursor.hasMoreElements()) {
			int a=(int) cursor.nextElement();
			System.out.println(a);
		}*/
		//default Iterator<E> asIterator(){ logic }
		Iterator iterator=cursor.asIterator();//Iterator(I)
		//boolean hasNext();
		//E next();
		//default void remove(){ logic }
		while(iterator.hasNext()) {
			int b=(int) iterator.next();
			System.out.println(b);
			//if(b==3)
				//iterator.remove();//RE:
		}
		System.out.println(v);//[0, 1, 2, 3, 4, 5]
	}
	public static void copyInto() {
		//public synchronized void copyInto(Object[] anArray)
		Vector v=new Vector();
		for (int i = 0; i <=5; i++) {
			v.addElement(i);
		}
		System.out.println(v);//[0, 1, 2, 3, 4, 5]
		//Object[] ob=new Object[10];
		//int[] ob=new int[10];//CE:
		Integer[] ob=new Integer[10];
		v.copyInto(ob);
		System.out.println(Arrays.toString(ob));//[0, 1, 2, 3, 4, 5, null, null, null, null]
	}
	public static void main(String[] args) {
		//isEmpty();//addElement();//size();//capacity();
		//elementAt();//firstElement();//lastElement();
		//insertElementAt();//setElementAt();
		//removeElement();//removeElementAt();//removeAllElements();//removeRange();
		//trimToSize();//ensureCapacity();//setSize();
		
		//elements();//returns Enumeration(I)
		//copyInto();
		//clone();
	}
}
