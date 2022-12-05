package org.constr;

public class Students {

	private Students() {

		System.out.println("Students details\n===============");

	}

	public Students(String name) {

		System.out.println("Student name : " +name);

	}

	public Students(int age) {

		System.out.println("Student Age :" + age);

	}

	public Students(int id, float data) {

		System.out.println("Student id : " + id);

	}

	public static void main(String[] args) {
		
		Students stu = new Students();
		Students stu2 = new Students("Lakshmi");
		Students stu3 = new Students(25);
		Students stu4 = new Students(687, 8.9f);
		
		

	}

}
