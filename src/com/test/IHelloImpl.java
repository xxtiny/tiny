package com.test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class IHelloImpl extends UnicastRemoteObject implements IHello {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected IHelloImpl() throws RemoteException {
		super();
	}

	@Override
	public Map<String, String> getObj() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name","Test RMI");
		map.put("number","3");
		map.put("boolean","true");
		return map;
	}
	
	

}
