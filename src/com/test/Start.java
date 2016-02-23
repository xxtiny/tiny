package com.test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Start {

	public static void main(String[] args){
		try {
			IHello hello = new IHelloImpl();
			 LocateRegistry.createRegistry(1099);  
			Naming.rebind("rmi://localhost:1099/hello", hello);
			System.out.println("Ready...................");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
