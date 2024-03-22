package org.example;

public class Employee {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Тележенко Андрей Андреевич", "тестировщик", "andrey@test.com", "+79912345678", 112345, 32);
        employee1.info();
    }
    private final String fullName;
    private final String position;
    private final String email;
    private final String phone;
    private final double salary;
    private final int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println(fullName+" "+position+" "+email+" "+phone+" "+salary+" "+age);
    }

}
















