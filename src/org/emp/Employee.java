package org.emp;

public class Employee {
	public void empid(long ph){
		System.out.println("phone number of emp" +ph);
	}
	public void empid(String name) {
		System.out.println("emp name is"+name);
	}
	public void empid(float pay) {
		System.out.println("salary pay is"+pay);
	}
	public static void main(String[] args) {
		Employee e= new Employee();
		e.empid(96522116632l);
		e.empid("ashok");
		e.empid(2345f);
		
	}
	

	

}

