package org.example.oop.employees;

public class Main {
    public static void main (String[] args) {
        Employees employees = new Employees("Dima", "cook", 34000);
        System.out.println(employees.info(5));
    }
}
