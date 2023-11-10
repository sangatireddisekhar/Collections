package com.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection_Methods {

	public static void main(String[] args) {
		System.out.println("main");
		//isEmpty();
		//size();
		//add();//addAll();
		//remove();//removeAll();//retainAll();//clear();
		//contains();//containsAll();
		//toArray();//2
		//iterator();
		//hashCode(); and equals();
		Hashtable s=new Hashtable();
		System.out.println(s.put(1,1));
		LinkedList l=new LinkedList();
		
		//System.out.println(s.put(2,null));
		//System.out.println(s.put(3,null));
		//System.out.println(s.put(null,"3a"));
		//System.out.println(s.put(null,"3b"));
		//add(null);
		//System.out.println(s.add(122));
		//System.out.println(s.add(123));
		//System.out.println(s.add(125));
		//System.out.println(s.add(null));
		//System.out.println(s.add(1));
		System.out.println(s);
	}
	public static void isEmpty() {
		//boolean isEmpty();
		Collection col=new ArrayList();
		System.out.println(col.isEmpty());//true
		col.add("abc");
		System.out.println(col);
		System.out.println(col.isEmpty());//false
	}
	private static void size() {
		//int size();     //it counts no.of elements
		Collection col=new ArrayList();
		col.add("abc");
		col.add(true);
		System.out.println(col.size());//2
		col.add(12);
		System.out.println(col.size());//3
	}
	public static void add() {
		// boolean add(E e);
		//boolean addAll(Collection<? extends E> c);
		Collection col=new ArrayList();
		Collection col1=new ArrayList();
		System.out.println(col.add("abc"));//true
		System.out.println(col.add(11));   //true
		col.add(true);
		Student s=new Student(10,"sekhar");
		col.add(s);
		System.out.println(col);//[abc, 11, true, Student [sid=10, sname=sekhar]]
		System.out.println(col1);//[]
		col1.add(50);
		col1.add("xyz");
		System.out.println(col1.addAll(col));//true
		System.out.println(col1);//[50, xyz, abc, 11, true, Student [sid=10, sname=sekhar]]
	}
	public static void remove() {
		//boolean remove(Object o);
		//boolean removeAll(Collection<?> c);
		//boolean retainAll(Collection<?> c);
		//void clear();
		Collection col=new ArrayList();
		Collection col1=new ArrayList();
		col.add("abc");
		col.add(12);
		col.add(50);
		System.out.println(col.remove(50));//true
		System.out.println(col.remove(40));//false
		col.add(true);
		Student s=new Student(10,"sekhar");
		col.add(s);
		System.out.println(col);//[abc, 12, true, Student [sid=10, sname=sekhar]]
		col1.addAll(col);
		System.out.println(col1);//[abc, 12, true, Student [sid=10, sname=sekhar]]
		col1.add(1);
		col1.add("xyz");
		System.out.println(col1);//[abc, 12, true, Student [sid=10, sname=sekhar], 1, xyz]
		/*System.out.println((col1.removeAll(col)));//true
		System.out.println(col1);//[1, xyz]  */

		/*System.out.println((col1.retainAll(col)));//true
		System.out.println(col1);//[abc, 12, true, Student [sid=10, sname=sekhar]] */

		/*col1.clear();  //it deletes all data
		System.out.println(col1);//[]  */
	}
	public static void contains() {
		//boolean contains(Object o);
		//boolean containsAll(Collection<?> c);
		Collection col=new ArrayList();
		Collection col1=new ArrayList();
		col.add("abc");
		col.add(12);
		col.add(true);
		Student s=new Student(10,"sekhar");
		col.add(s);
		System.out.println(col);//[abc, 12, true, Student [sid=10, sname=sekhar]]
		col1.addAll(col);
		System.out.println(col1);//[abc, 12, true, Student [sid=10, sname=sekhar]]
		col1.add(1);
		col1.add("xyz");
		System.out.println(col1);//[abc, 12, true, Student [sid=10, sname=sekhar], 1, xyz]
		System.out.println(col1.contains("abc"));//true
		System.out.println(col1.contains(1));//true
		System.out.println(col1.contains(s));//true
		System.out.println(col1.contains(50));//false
		System.out.println(col1.containsAll(col));//true
	}
	public static void toArray() {
		// Object[] toArray();
		//<T> T[] toArray(T[] a);
		Collection col=new ArrayList();
		col.add("abc");
		col.add(true);
		col.add(12);
		col.add('1');
		col.add(null);
		System.out.println(col);
		//String[] s=(String[]) col.toArray();//RE:ClasCastE
		Object[] ob=col.toArray();
		System.out.println(ob);//[Ljava.lang.Object;@4617c264
		Object[] ob1=col.toArray(ob);
		System.out.println(ob1);//[Ljava.lang.Object;@4617c264
		Collection col1=new ArrayList();
		String[] s=new String[5];
		col1.add("abc");
		col1.add("aac");
		col1.add("aba");
		//s=(String[]) col1.toArray(s);
		System.out.println(s);//[Ljava.lang.String;@36baf30c
		System.out.println(s[0]);//abc
		System.out.println(s[1]);//aac
		System.out.println(s[2]);//aba
	}
	public static void iterator() {
		//Iterator<E> iterator();
		Collection col=new ArrayList();
		col.add("abc");
		col.add("as");
		col.add("aaa");
		System.out.println(col);//[abc, as, aaa]
		Iterator it=col.iterator();
		System.out.println(it);//java.util.ArrayList$Itr@4617c264
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob); 
			String s=(String)ob;
			if(s.equals("abc"))
				it.remove();
		}
		System.out.println(col);//[as, aaa]
	}

}
