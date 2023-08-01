package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test extends ArrayList{
	@Override
	protected void removeRange(int fromIndex, int toIndex) {
		super.removeRange(fromIndex, toIndex);
	}
	public static void main(String[] args) {
		Test l=new Test();
		List l1=List.of(1,2,2,3,4,4,5,7,8);
		l.addAll(l1);
		System.out.println(l);
		l.removeRange(2,7);
		System.out.println(l.size());
		System.out.println(l);
		l.removeAll(l1);
		System.out.println(l);
		
	}
}
