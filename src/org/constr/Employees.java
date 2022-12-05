package org.constr;

public class Employees extends Client {

	public Employees() {
	

		System.out.println("Employees details\n===============");

	}

	public Employees(String name) {
		this(2567, 90.8f);

		System.out.println("Employees name :" +name);

	}

	public Employees(int age) {
		this("Lakshmi");

		System.out.println("Employees Age :" +age);

	}

	public Employees(int id, float data) {
		super('@');

		System.out.println("Employees id : " +id);

	}

	public static void main(String[] args) {

		Employees emp = new Employees(25);
		
	}

}
