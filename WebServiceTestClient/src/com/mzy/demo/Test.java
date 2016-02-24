package com.mzy.demo;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class Test {

	public static void main(String[] args) throws ServiceException, RemoteException {
		String endpoint = "http://192.168.50.28:8080/WebServiceTest/services/WebServiceTest?wsdl";
		Service service = new Service();
		Call call = (Call)service.createCall();
		call.setTargetEndpointAddress(endpoint);
		call.setOperationName("sayHello");
		String res = (String)call.invoke(new Object[]{"Lucy"});
		System.out.println(res);
	}

}
