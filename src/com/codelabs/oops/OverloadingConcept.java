package com.codelabs.oops;

public class OverloadingConcept {

	public void printSalary(int salary) {
        System.out.println("Salary without bonus : "+salary);
    }
    
    public void printSalary(int salary,double bonus) {
        System.out.println("Salary with bonus : "+(salary+bonus));
    }
    
    public static void main(String[] args) {
    	OverloadingConcept e1 =new OverloadingConcept();
        // if no bonus provided, we can use this method
        e1.printSalary(20000);
        System.out.println("**********************");
        // If bonus provided we can pass to overloaded method and add to salary
        e1.printSalary(20000, 10000);
	}
}
