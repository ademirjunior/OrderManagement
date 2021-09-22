package com.ordermanagement;

import java.util.Date;

import javax.naming.Context;

import com.ordermanagement.beans.TestSessionBeanRemote;

public class SessionBeanClient {

	public static void main(String[] args) throws Exception {
		Context context = EJBBeanHelper.getInitialContext();
		TestSessionBeanRemote lookup = (TestSessionBeanRemote) context
				.lookup("bean/testMappingBean#com.ordermanagement.beans.TestSessionBeanRemote");
		lookup.sayHi("AJ");
		System.out.println("["+new Date().toString()+"]"+"timer created");
		
	}

}
