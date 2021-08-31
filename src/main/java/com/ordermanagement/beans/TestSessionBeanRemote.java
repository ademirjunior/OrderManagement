package com.ordermanagement.beans;

import javax.ejb.Remote;

@Remote
public interface TestSessionBeanRemote {
 
	public void sayHi(String name);
	
}
