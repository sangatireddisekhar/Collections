package com.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map$Entry_Methods {
	static Map m=new HashMap();
	static {
		//V put(K key, V value);
		System.out.println(m.put(10, "AB"));//null
		System.out.println(m.put(12, "XY"));//null
		System.out.println(m.put(11, "RE"));//null
		System.out.println(m.put(15, "Se"));//null
	}
	public static void main(String[] args) {
		// K getKey();
		// K getValue();
		//V setValue(V value);
		System.out.println(m);//{10=AB, 11=RE, 12=XY, 15=Se}
		Set s=m.entrySet();
		System.out.println(s);//[10=AB, 11=RE, 12=XY, 15=Se]
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry) i.next();
			System.out.println(me.getKey()+":::"+me.getValue());//10:::AB
			if(me.getKey()==(Object)12)                         //....
				System.out.println(me.setValue("YZ"));//XY
		}
		System.out.println(m);//{10=AB, 11=RE, 12=YZ, 15=Se}
		System.out.println(s);//[10=AB, 11=RE, 12=YZ, 15=Se]
	}
}
