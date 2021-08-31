package com.ordermanagement.test;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.ordermanagement.beans.TestSessionBeanRemote;

public class SessionBeanClient {

	public static void main(String[] args) throws Exception {
		Context context = getInitialContext();
		TestSessionBeanRemote lookup = (TestSessionBeanRemote) context
				.lookup("bean/testMappingBean#com.ordermanagement.beans.TestSessionBeanRemote");
		lookup.sayHi("AJ");

	}

	// Step 1: getInitialContext
	static InitialContext getInitialContext() throws Exception {
		Properties properties = new Properties();
		properties.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		properties.put(Context.PROVIDER_URL, "t3://localhost:7001");
		properties.put(Context.SECURITY_PRINCIPAL, "ademiralcojr");
		properties.put(Context.SECURITY_CREDENTIALS, "123456");
		return new InitialContext(properties);
	}
}
