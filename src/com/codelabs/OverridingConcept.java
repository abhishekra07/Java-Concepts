package com.codelabs;

import java.io.IOException;

class Parent {
	
	public String name = "Parent";
	
	public Parent(){
		System.out.println("Parent Constructor");
	}
	
	public void method() {
		System.out.println("Parent method");
	}
	
	protected void protectedMethod() {
		System.out.println("Parent protectedMethod");
	}
	
	public void methodThrowsException()throws IOException {
		System.out.println("Parent methodThrowsException");
	}
}

class Child extends Parent{
	public String name = "Child";
	public String job = "Software Engineer";
	
	public Child() {
		System.out.println("Child Constructor");
	}
	
	public void method() {
		System.out.println("Child method");
	}
	
	/*
	 * less restrictive method override
	 */
	public void protectedMethod() {
		System.out.println("Child protectedMethod");
	}
	
	/*
	 * Can reduce or eliminate but must not throw new/broader checked exceptions
	 * can throws Unchecked Exception
	 */
	public void methodThrowsException() {
		System.out.println("Child methodThrowsException");
	}
}

public class OverridingConcept {
	
	public static void main(String[] args) {
		Child child = new Child();
		/*Parent Constructor
		Child Constructor*/
		child.method(); // print Child method
		child.protectedMethod(); // Child protectedMethod
		System.out.println(child.name); // Child
		System.out.println(child.job); // Software Engineer
		Parent parent = new Child(); 
		/*Parent Constructor
		Child Constructor*/
		parent.method(); // Child method
		parent.protectedMethod(); // Child protectedMethod
		System.out.println(parent.name); // Parent
	}
}