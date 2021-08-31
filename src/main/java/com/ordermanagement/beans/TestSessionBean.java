package com.ordermanagement.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestSessionBean
 */
@Stateless(mappedName = "bean/testMappingBean")
@LocalBean
public class TestSessionBean implements TestSessionBeanRemote {

    /**
     * Default constructor. 
     */
    public TestSessionBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void sayHi(String name) {
		System.out.println("Hello " + name);
	}
    
}
