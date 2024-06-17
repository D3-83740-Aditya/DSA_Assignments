package com.sunbeam;

import java.util.Scanner;

//Q4. Create array of employees and search employee by i. empid ii. name iii. salary

public class Tester {

	public static Employee searchById(Employee[] employee, int Id) {
		for (Employee e : employee) {
			if (e.getEmpid() == Id) {
				return e;
			}
		}
		return null;
	}

	public static Employee searchByName(Employee[] employee, String name) {
		for (Employee e : employee) {
			if (e.getName() == name) {
				return e;
			}
		}
		return null;
	}

	public static Employee searchBySalary(Employee[] employee, double salary) {
		for (Employee e : employee) {
			if (e.getSalary() == salary) {
				return e;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee emp[] = new Employee[4];

		emp[0] = new Employee(1, "Aditya", 60000);
		emp[1] = new Employee(2, "Ganesh", 50000);
		emp[2] = new Employee(3, "Sakshi", 70000);
		emp[3] = new Employee(4, "Shruti", 75000);

		System.out.println("Search by id: \n" + searchById(emp, 1));
		System.out.println();
		System.out.println("Search by name: \n" + searchByName(emp, "Sakshi"));
		System.out.println();
		System.out.println("Search by salary: \n" + searchBySalary(emp, 75000));
	}

}
