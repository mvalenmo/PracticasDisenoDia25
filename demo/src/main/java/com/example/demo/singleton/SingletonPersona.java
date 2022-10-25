package com.example.demo.singleton;

public class SingletonPersona {
  
  private static SingletonPersona personaInstance;
	
  private String name;
  private int age;
  
  private SingletonPersona() {
	  
  }
  
  public static SingletonPersona getInstance() {
	  if(personaInstance == null) {
		  personaInstance=new SingletonPersona();
	  }
	  
	  return personaInstance;
  }
  
  public void operacionSingleton() {
	  System.out.println("Mi nombre es: "+name+"y mi edad es "+age);
  }
  
  
}
