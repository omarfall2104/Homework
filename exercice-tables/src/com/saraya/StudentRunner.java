package com.saraya;

import java.util.ArrayList;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Jacob", 1001, 80.0 , 3, "H");
		Student student2 = new Student("Peter", 1002, 83.0, 2, "D");
		
		System.out.println("Details of the registered students");
		System.out.println("=======================================");
		System.out.println(student1);
		System.out.println("=======================================");
		System.out.println(student2);
		
		/*ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Jacob", 1001, 80.0 , 3, "H"));
		students.add(new Student("Peter", 1002, 83.0, 2, "D"));
		students.add(new Student(5, "Salif ndiaye", "L3 Math", "D"));
		students.add(new Student(7, "Fatou Gueye", "L3 Math", "D"));
		students.add(new Student(4, "Laye Tall", "Marster Info", "H"));
		students.add(new Student(3, "Fifi ndiaye Sarr", "L3 Gestion", "D"));
		students.stream().forEach(e ->  System.out.println(e)); */
		
	}
	

}
