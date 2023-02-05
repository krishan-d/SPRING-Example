package com.learn.spring;

public class Alien {

	private int age;

//	private Leptop leptop; // Reference object i.e. use ref attribute in property configuration

	private Computer com;

	public Alien() {
		System.out.println("constructor created!");
	}

//	public Alien(int age) {
//		this.age = age;
//	}

	public void code() {
		System.out.println("coding...");
//		leptop.compile();
		com.compile();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("calling setAge...");
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

//	public Leptop getLeptop() {
//		return leptop;
//	}

//	public void setLeptop(Leptop leptop) {
//		this.leptop = leptop;
//	}

}
