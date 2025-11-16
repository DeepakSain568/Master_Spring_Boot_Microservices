package com.LearnSpringBoot.first.Utilities;

 public class TestBean {
   String name;
   String password;
   
	public TestBean(String name,String password) {
		this.name = name;
		this.password = password;
		System.out.println("TestBean class constructor \n name:"+name+"\n password: "+password);
	}
}
