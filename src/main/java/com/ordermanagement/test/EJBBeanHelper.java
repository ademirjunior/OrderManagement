package com.ordermanagement.test;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

public class EJBBeanHelper {
	
	static InitialContext getInitialContext() throws Exception {
		Properties properties = new Properties();
		properties.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		properties.put(Context.PROVIDER_URL, "t3://localhost:7001");
		//Usar variáveis de ambiente
		properties.put(Context.SECURITY_PRINCIPAL, "ademiralcojr");
		properties.put(Context.SECURITY_CREDENTIALS, "123456!");
		return new InitialContext(properties);
	}
	
}
