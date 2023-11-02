package practice.company.dao;

//- добавить сотрудника
//- удалить сотрудника
//- найти сотрудника
//- кол-во сотрудников
//- ФОТ
//- средняя з/п
//- объем продаж
//- напечатать список сотрудников

import practice.company.model.Employee;

public interface Company {
    // объявляем методы, толику сигнатуры без тела метода
    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee(int id);
   int quantity();
    double totalSalary();// ФОТ зарплата всех
    double avgSalary();// средняя зарплата
    double totalSales();// объем продаж

    void printEmployees();




}
