package com.Comparator;

import java.util.TreeSet;

import com.Comparable.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(100,"Siva");
		Employee e2=new Employee(10,"Raju");
		Employee e3=new Employee(105,"Priya");
		Employee e4=new Employee(100,"Simha");
		Employee e5=new Employee(150,"Sekhar");
		Employee e6=new Employee(110,"Reddy");
		Employee e7=new Employee(10,"Siva");
		//TreeSet t=new TreeSet();//[10::Raju, 100::Siav, 105::Priya, 110::Reddy, 150::Sekhar]
		TreeSet t=new TreeSet(new MyComparator03());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		t.add(e7);
		System.out.println(t);
	}
}
