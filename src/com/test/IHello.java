package com.test;

import java.rmi.Remote;
import java.util.Map;

public interface IHello extends Remote {
	
	public Map<String, String> getObj() throws java.rmi.RemoteException;;

}
