package com.springcore.CI;

public class Person {
	
	private int pid;
	private String pname;
	private Address add;
	
	public Person(int pid, String pname, Address add) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.add= add;
	}	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person id=" + this.pid + ", person name=" + this.pname+ ",Address is:"+this.add.area+" "+this.add.pin;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
