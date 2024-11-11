package com.springcore.CI;

public class Address {
	
	String area;
	int pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.area +","+ this.pin ;
	}
	public Address(String area, int pin) {
		super();
		this.area = area;
		this.pin = pin;
	}
	
	

}
