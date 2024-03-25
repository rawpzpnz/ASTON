package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Тележенко Андрей Андреевич", "тестировщик", "andrey@test.com", "+79912345678", 112345, 32);
        employee1.info();
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivanov@example.com", "+79991234501", 50400, 30);
        employees[1] = new Employee("Петров Петр Петрович", "Менеджер", "petrov@example.com", "+79991234502", 60020, 35);
        employees[2] = new Employee("Сидоров Алексей Владимирович", "Разработчик", "sidorov@example.com", "+79991234503", 70000, 28);
        employees[3] = new Employee("Васильева Мария Игоревна", "Дизайнер", "vasilyeva@example.com", "+79991234504", 55100, 26);
        employees[4] = new Employee("Кузнецов Андрей Борисович", "Тестировщик", "kuznetsov@example.com", "+79991234505", 50020, 40);

        // Вывод информации о сотрудниках
        for (Employee employee : employees) {
            employee.info();
            System.out.println();
        }
    }
}