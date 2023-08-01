package com.Comparator;

import java.util.Comparator;

import com.Comparable.Employee;

public class MyComparator03 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		String s1=e1.getEname();
		String s2=e2.getEname();
		//1.
		//return e1.compareTo(e2);//[10::Raju, 100::Siva, 105::Priya, 110::Reddy, 150::Sekhar]
		//2.
		//return e2.compareTo(e1);//[150::Sekhar, 110::Reddy, 105::Priya, 100::Siva, 10::Raju]
		//3.
		return s1.compareTo(s2);//[105::Priya, 10::Raju, 110::Reddy, 150::Sekhar, 100::Simha, 100::Siva]
	}

}
