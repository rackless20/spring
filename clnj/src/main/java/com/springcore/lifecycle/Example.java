package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	  
	private String sub;

	/**
	 * @return the sub
	 */
	public String getSub() {
		return sub;
	}

	/**
	 * @param sub the sub to set
	 */
	public void setSub(String sub) {
		this.sub = sub;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Example [sub=" + sub + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("subject start");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("subject end");
	}
}
	 
	


