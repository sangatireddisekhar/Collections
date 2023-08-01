package com.basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Methods {
	static Map m=new HashMap();
	public static void main(String[] args) {
		//isEmpty();
		//size();
		put();
		//putAll();
		//get();
		//remove();
		//clear();
		//containsKey();
		//containsValue();
		System.out.println("SSSSS");
		//keySet();
		//values();
		//entrySet();
	}

	public static void isEmpty() {
		//boolean isEmpty();
		System.out.println(m.isEmpty());//true
		System.out.println(m.put(10, "AB"));//null
		System.out.println(m.isEmpty());//false
	}
	private static void size() {
		//int size();
		System.out.println(m.size());//0
		System.out.println(m.put(10, "AB"));//null
		System.out.println(m.size());//1
	}
	public static void put() {
		//V put(K key, V value);
		System.out.println(m.put(10, "AB"));//null
		System.out.println(m.put(12, "XY"));//null
		System.out.println(m.put(11, "RE"));//null
		System.out.println(m.put(15, "Se"));//null
		System.out.println(m);//{10=AB, 11=RE, 12=XY, 15=Se}
		System.out.println(m.put(12, "XA"));//XY     //Update Operation
		System.out.println(m);//{10=AB, 11=RE, 12=XA, 15=Se}
	}
	public static void putAll() {
		//void putAll(Map<? extends K, ? extends V> m);
		Map m1=new HashMap();
		System.out.println(m1.put(10, "AB"));//null
		System.out.println(m1.put(12, "XY"));//null
		System.out.println(m1.put(11, "RE"));//null
		System.out.println(m1.put(15, "Se"));//null
		m.putAll(m1);
		System.out.println(m);//{10=AB, 11=RE, 12=XY, 15=Se}
	}
	public static void get() {
		//V get(Object key);
		System.out.println(m.put(10, "AB"));//null
		Object o=m.get(10);
		System.out.println(o);//AB
	}
	public static void remove() {
		//V remove(Object key);
		System.out.println(m.put(10, "AB"));//null
		System.out.println(m.put(12, "XY"));//null
		System.out.println(m);//{10=AB, 12=XY}
		System.out.println(m.remove(12));//XY
		System.out.println(m);//{10=AB}
	}
	public static void clear() {
		//void clear();
		put();
		m.clear();
		System.out.println(m);//{}
	}
	public static void containsKey() {
		//boolean containsKey(Object key);
		put();
		System.out.println(m.containsKey(12));//true
	}
	public static void containsValue() {
		//boolean containsValue(Object value);
		put();
		System.out.println(m.containsValue(12));//false
		System.out.println(m.containsValue("AB"));//true
	}
	//Colection views of Map
	public static void keySet() {
		//Set<K> keySet();
		put();
		Set s=m.keySet();
		System.out.println(s);//[10, 11, 12, 15]
	}
	public static void values() {
		//Collection<V> values();
		put();
		Collection c=m.values();
		System.out.println(c);//[AB, RE, XA, Se]
	}
	public static void entrySet() {
		//Set<Map.Entry<K, V>> entrySet();
		put();
		System.out.println(m);//{10=AB, 11=RE, 12=XA, 15=Se}
		Set s=m.entrySet();
		System.out.println(s);//[10=AB, 11=RE, 12=XA, 15=Se]
	}
}
