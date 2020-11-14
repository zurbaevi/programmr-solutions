package com.programmr.java.classes;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class EmployeeСlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String first = scanner.nextLine();
        System.out.println("Enter last name:");
        String last = scanner.nextLine();
        System.out.println("Enter monthly salary:");
        double salary = scanner.nextDouble();
        Employee e1 = new Employee(first, last, salary);

        System.out.println("First name:" + e1.getFirst());
        System.out.println("Last name:" + e1.getLast());
        System.out.println("Salary:" + e1.getSalary());

    }
}

class Employee {
    String first;
    String last;
    double salary;

    public Employee(String first, String last, double salary) {
        this.first = first;
        this.last = last;
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public double getSalary() {
        return salary;
    }
}
