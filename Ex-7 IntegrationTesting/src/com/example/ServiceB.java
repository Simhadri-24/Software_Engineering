package com.example;

public class ServiceB {
	private ServiceA serviceA;
	 public ServiceB(ServiceA serviceA) {
	 this.serviceA = serviceA;
	 }
	 public String process (String input) {
	 return serviceA.process(input) + " and enhanced by ServiceB";
	 }

}
