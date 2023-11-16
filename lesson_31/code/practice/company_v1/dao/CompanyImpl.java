package practice.company_v1.dao;

import practice.company_v1.model.Employee1;
import practice.company_v1.model.SalesManager1;


public class Company1Impl implements Company1 {
    // поля которые описывают компанию
    private Employee1[] employee1s;// создали массив работников
    private int size;

    // конструктор
    public Company1Impl(int capacity) {
        employee1s = new Employee1[capacity];// capacity maksimaljniy razmer companii
    }

    @Override
    public boolean addEmployee(Employee1 employee1) {
        //не добавляем null, не превышено capacity, не добавляем уже существующий


        if (employee1 == null || size == employee1s.length || findEmployee( employee1.getId() ) != null) {
            return false;
        }

        //employees[size] = employee;// новый элемент
        //size++;
        employee1s[size++] = employee1;// постфиксная операция
        return true;
    }

    @Override
    public Employee1 removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employee1s[i].getId() == id) {
                Employee1 victim = employee1s[i];// убрали найденный элемент в переменную
                // employees[i] = employees[size-1];// на место найденного поставили последующего существующего в массиве
                //employees[size-1] = null; // обнулили последнего
                //size--;
                employee1s[i] = employee1s[--size];// префиксная операция
                employee1s[size] = null;// обнуляет последний элемент
                return victim;
            }

        }
        return null;
    }

    @Override
    public Employee1 findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employee1s[i].getId() == id) {// нашелся элемент массива у которого совпал ID
                return employee1s[i];// вернули найденный элемент массива типа Employee
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
            res += employee1s[i].calcSalary();

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
            if (employee1s[i] instanceof SalesManager1) {
                SalesManager1 salesManager1 = (SalesManager1) employee1s[i];// провели кастинг
                res += salesManager1.getSalesValue();

            }

        }
        return res;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i <= size; i++) {
            System.out.println( employee1s[i] );

        }

    }

    // Для выборки элементов из массива, удовлетворяющих заданному условию, надо:
    // Сначала подсчитать количество элементов массива, удовлетворяющих условию.
    // Потом создать массив под это количество,
    // и только потом его заполнить.
    @Override
    public Employee1[] findEmployeesHoursGreaterThan(int hours) {
int count = 0;
// считаем сколько будет лементов массива по условию
        for (int i = 0; i <size; i++) {
            if (employee1s[i].getHours() > hours) {
                count++;

            }
        }

        Employee1[] res = new Employee1[count]; //создаем массив
        //
        for (int i = 0, j = 0; j <res.length ; i++) {
            if (employee1s[i].getHours() > hours){
                res[j++] = employee1s[i];
            }
        }

        return res;
    }

    @Override
    public Employee1[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employee1s[i].calcSalary() > minSalary && employee1s[i].calcSalary()< maxSalary){
                count++;
            }

        }
        Employee1[] res = new Employee1[count]; //создаем массив
        for (int i = 0, j = 0; j <res.length ; i++) {
            if (employee1s[i].calcSalary() > minSalary && employee1s[i].calcSalary()< maxSalary){
                res[j++] = employee1s[i];
            }
        }

        return res;
    }
}
