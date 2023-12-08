package practice.company_v3.dao_v3;

import practice.company_v3.model_v3.Employee;
import practice.company_v3.model_v3.SalesManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CompanyHashSetImpl implements Company{
    //Закончить проект Company:
    // реализация на HashSet,
    // заменить все циклы на stream.

    private Set<Employee> employees; // вместо  List создаем Set
    int capacity; // вместимость компании
    public CompanyHashSetImpl(int capacity) {
        this.capacity = capacity; // это ограничение по кол-ву сотрудников в компании
        employees = new HashSet<>(); // длину (размер) указывать не надо
    }
    //O(1) в худшем случаи O(n)
    @Override
    public boolean addEmployee(Employee employee) {
        // Проверяем, что сотрудник не равен null
        // и количество сотрудников в компании меньше заданной
        // Пытаемся добавить сотрудника в коллекцию employees и возвращаем результат
        return employee != null && employees.size() < capacity && employees.add(employee);
        }

//O(1) в худшем случаи O(n)
    @Override
    public Employee removeEmployee(int id) {
        // Находим сотрудника по id
        Employee victim = findEmployee(id);
        // Удаляем найденного сотрудника
        employees.remove(victim);
        // Возвращаем удаленного сотрудника или null, если сотрудник не был найден
            return victim;

    }
//O(n)
    @Override
    public Employee findEmployee(int id) {
        return employees.stream()
                .filter(e -> e.getId() == id) // Фильтруем по id
                .findFirst()// Берем первый найденный элемент
                .orElse(null);// Возвращаем его или null, если ничего не найдено
    }
//O(1)
    @Override
    public int quantity() {

        return employees.size(); // Возвращает количество сотрудников
    }

    @Override
    public double totalSalary() {
        return employees.stream()
                // Преобразуем каждого сотрудника в значение его зарплаты
                .mapToDouble(Employee::calcSalary)
                // Суммируем все значения зарплаты
                .sum();
    }

    @Override
    public double avgSalary() {
        // Общая зарплата делится на количество сотрудников
        return totalSalary() / employees.size();
    }

    @Override
    public double totalSales() {
        return employees.stream()
                .filter(e -> e instanceof SalesManager) // Фильтруем только SalesManager
                .mapToDouble(e -> ((SalesManager) e).getSalesValue())// Получаем значения продаж
                .sum();// Суммируем значения продаж
    }

    @Override
    public void printEmployees() {
        employees.forEach(  System.out:: println  ); // Вывод каждого сотрудника

    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        // Использует предикат для поиска сотрудников
        return findEmployeesByPredicate(e -> e.getHours() >= hours);
    }

    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate) {
        return employees.stream()
                .filter(predicate)// Фильтрует сотрудников с predicate
                .toArray(Employee[]::new);// Преобразует результат в массив сотрудников
    }


    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findEmployeesByPredicate(e -> { // Использует predicate для фильтрации по диапазону зарплаты
            double salary = e.calcSalary();// Получаем значение зарплаты
            return salary >= minSalary && salary < maxSalary;// Проверяем, находится ли зарплата в диапазоне
        });

    }
}
