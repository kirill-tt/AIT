package practice.company_v2.dao;

import practice.company_v2.model.Employee;
import practice.company_v2.model.Manager;
import practice.company_v2.model.SalesManager;
import practice.company_v2.model.Worker;

import java.util.*;

public class EmployeeAppl {
    public static void main(String[] args) {

        Employee[] empl = new Employee[4];
        empl[0] = new Manager(100, "John", "Smith", 45, 160, 10, "UNI ",5000, 5);
        empl[1] = new SalesManager(101,"Anna", "Black", 36, 160, 4,"Grund Schule",25000, 0.1);
        empl[2] = new SalesManager(102,"Thomas", "White", 28, 160, 9,"Gymnasium",30000, 0.1);
        empl[3] = new Worker(103, "Gans", "Bauer", 30, 80, 9,"Hochschule",5);

//        e[0] = new Manager(101, "John", "Smith", 45, 160, 5000, 5);
//        e[1] = new SalesManager(102, "Anna", "Black", 36, 160, 25000, 0.1);
//        e[2] = new SalesManager(103, "Thomas", "White", 28, 160, 30000, 0.1);
//        e[3] = new Worker(104, "Gans", "Bauer", 30, 80, 5);
        List<Employee> employeesList = Arrays.asList(empl);

        // Создание копии списка
        List<Employee> sortedByExperience = new ArrayList<>(employeesList);
        List<Employee> sortedByEducation = new ArrayList<>(employeesList);

        // Сортировка списка сотрудников по стажу работы
        Collections.sort(sortedByExperience, Comparator.comparingInt(Employee::getWorkExperience).reversed());

        // Сортировка списка сотрудников по образованию
        Collections.sort(sortedByEducation, Comparator.comparing(Employee::getEducation).reversed());

        // Вывод информации о сотрудниках после сортировки по стажу работы
        System.out.println("Employees Sorted by Work Experience:");
        for (Employee e : sortedByExperience) {
            System.out.println(e);

        }
        System.out.println("========================================================");
        // Вывод информации о сотрудниках после сортировки по образованию
        System.out.println("Employees Sorted by Education:");
        for (Employee e : sortedByEducation) {
            System.out.println(e);
        }

        double total = totalSalary(empl); // вызываем метод для расчета зарплаты
        System.out.println("Total salary: " + total);
        double average = averageAge(empl);
        System.out.println("Average age: " + average);
        double totalSales = totalSales(empl);
        System.out.println("Total sales " + totalSales);

    }

    private static double totalSalary(Employee[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] != null){
                sum += empl[i].calcSalary();
            }
        }
        return sum;
    }

    private static double averageAge(Employee[] empl) {
        double average = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] != null){
                average += empl[i].getAge();
            }
        }
        return average / empl.length;
    }

    private static double totalSales(Employee[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] instanceof SalesManager){
                SalesManager salesManager = (SalesManager) empl[i];
                sum += salesManager.getSalesValue();
            }
        }
        return sum;
    }

}