package practice.company_v3.dao_v3;

import practice.company_v3.model_v3.Employee;
import practice.company_v3.model_v3.SalesManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CompanyHashSetImpl implements Company{
    private Set<Employee> employees; // вместо  List создаем Set
    int capacity; // вместимость компании
    public CompanyHashSetImpl(int capacity) {
        this.capacity = capacity; // это ограничение по кол-ву сотрудников в компании
        employees = new HashSet<>(); // длину (размер) указывать не надо
    }
    //O(1) в худшем случаи O(n)
    @Override
    public boolean addEmployee(Employee employee) {
        if(employee == null || employees.size() == capacity ) {
            return false;
        }

        return  employees.add(employee);// добавили в список сотрудника (элемент Set)
        // операция добавления из множества имеет сложность O(1)

    }
//O(1) в худшем случаи O(n)
    @Override
    public Employee removeEmployee(int id) {
        Employee victim = findEmployee(id);
        employees.remove(victim);
            return victim;
            //Set Множество не содержит в общем случае элемент null, поэтому проверка na null не требуется
    }
//O(n)
    @Override
    public Employee findEmployee(int id) {
        for (Employee e : employees) { // e - это employee из списка employees
            if (e.getId() == id) {
                return e; // вернули найденный элемент
            }
        }
        return null;
    }
//O(1)
    @Override
    public int quantity() {
        return employees.size();
    }

    @Override
    public double totalSalary() {
        double res = 0;

        for (Employee e : employees) {
            res += e.calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / employees.size();
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (Employee e : employees) {
            if(e instanceof SalesManager) {
                //SalesManager salesManager = (SalesManager) e;
                res += ((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        employees.forEach( e -> System.out.println(e)  ); // отправляем все элементы на печати

    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return findEmployeesByPredicate(e -> e.getHours() >= hours);
    }

    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate) {
        List<Employee> res = new ArrayList<>();
        for (Employee employee : employees) {
            if(predicate.test( employee )){
                res.add( employee );

            }

        }
        return res.toArray( new Employee[0]);
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findEmployeesByPredicate( e -> e.calcSalary() >=minSalary && e.calcSalary() < maxSalary );
    }
}
