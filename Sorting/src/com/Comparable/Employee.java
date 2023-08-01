package com.Comparable;

public class Employee implements Comparable{
	private int eid;
	private String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public int compareTo(Object o) {
		int id1=this.eid;
		int id2=((Employee)o).eid;
		if(id1<id2)
			return -1;
		else if(id1>id2)
			return +1;
		else
			return 0;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "" + eid + "::" + ename + "";
	}
}
