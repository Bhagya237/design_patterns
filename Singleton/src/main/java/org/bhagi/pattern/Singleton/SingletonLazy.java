package org.bhagi.pattern.Singleton;

public class SingletonLazy {
	
	private static SingletonLazy instant;
	
	private SingletonLazy(){
		
	}
	public static synchronized SingletonLazy getInstant(){
		if(null ==instant){
			instant=new SingletonLazy();
		}
		return instant;
	}
}
