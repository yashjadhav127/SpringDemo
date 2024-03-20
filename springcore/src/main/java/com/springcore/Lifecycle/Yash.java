package com.springcore.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Yash implements InitializingBean , DisposableBean {
	
	
	String mind;

	public Yash(String mind) {
		super();
		
		System.out.println("initilizing value");
		this.mind = mind;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.print("destroying the objet");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.print("Initilizing bean");
		
	}

	@Override
	public String toString() {
		return "Yash [mind=" + mind + "]";
	}
	
	
	
	
	

}
