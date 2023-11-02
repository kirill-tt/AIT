package practice.company_v1.dao;

import practice.company_v1.model.Employee;
import practice.company_v1.model.SalesManager;


public class CompanyImpl implements Company {
    // поля которые описывают компанию
    private Employee[] employees;// создали массив работников
    private int size;

    // конструктор
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];// capacity maksimaljniy razmer companii
    }

    @Override
    public boolean addEmployee(Employee employee) {
        //не добавляем null, не превышено capacity, не добавляем уже существующий


        if (employee == null || size == employees.length || findEmployee( employee.getId() ) != null) {
            return false;
        }

        //employees[size] = employee;// новый элемент
        //size++;
        employees[size++] = employee;// постфиксная операция
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee victim = employees[i];// убрали найденный элемент в переменную
                // employees[i] = employees[size-1];// на место найденного поставили последующего существующего в массиве
                //employees[size-1] = null; // обнулили последнего
                //size--;
                employees[i] = employees[--size];// префиксная операция
                employees[size] = null;// обнуляет последний элемент
                return victim;
            }

        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {// нашелся элемент массива у которого совпал ID
                return employees[i];// вернули найденный элемент массива типа Employee
            }

        }

        return null;
    }

    @Override
    public int quantity() {

        return size;
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += employees[i].calcSalary();

        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / size;

    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) {
                SalesManager salesManager = (SalesManager) employees[i];// провели кастинг
                res += salesManager.getSalesValue();

            }

        }
        return res;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i <= size; i++) {
            System.out.println( employees[i] );

        }

    }

    // Для выборки элементов из массива, удовлетворяющих заданному условию, надо:
    // Сначала подсчитать количество элементов массива, удовлетворяющих условию.
    // Потом создать массив под это количество,
    // и только потом его заполнить.
    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
int count = 0;
// считаем сколько будет лементов массива по условию
        for (int i = 0; i <size; i++) {
            if (employees[i].getHours() > hours) {
                count++;

            }
        }

        Employee [] res = new Employee[count]; //создаем массив
        //
        for (int i = 0, j = 0; j <res.length ; i++) {
            if (employees[i].getHours() > hours){
                res[j++] = employees[i];
            }
        }

        return res;
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].calcSalary() > minSalary && employees[i].calcSalary()< maxSalary){
                count++;
            }

        }
        Employee [] res = new Employee[count]; //создаем массив
        for (int i = 0, j = 0; j <res.length ; i++) {
            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary()< maxSalary){
                res[j++] = employees[i];
            }
        }

        return res;
    }
}
