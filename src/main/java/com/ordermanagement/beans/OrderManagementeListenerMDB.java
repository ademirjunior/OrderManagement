package com.ordermanagement.beans;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: OrderManagementeListenerMDB
 */
@MessageDriven( name = "testMDB", activationConfig = { 
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "connectionFactoryJndiName", propertyValue = "jjms/jms/orderMgmtConnectionFactory"),
		@ActivationConfigProperty(propertyName = "destinationJndiName", propertyValue = "jms/orderMgmtQueue")
		})
public class OrderManagementeListenerMDB implements MessageListener {

    /**
     * Default constructor. 
     */
    public OrderManagementeListenerMDB() {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
       TextMessage msg = (TextMessage) message;
       try {
		System.out.println("Message has benen received and the message content is: " + msg.getText());
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

}
