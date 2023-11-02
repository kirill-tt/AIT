package practice.company_v1.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company_v1.dao.Company;
import practice.company_v1.dao.CompanyImpl;
import practice.company_v1.model.Employee;
import practice.company_v1.model.Manager;
import practice.company_v1.model.SalesManager;
import practice.company_v1.model.Worker;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {
    Company company;
    Employee[] e;


    @BeforeEach
    void setUp() {
        company = new CompanyImpl( 5 );
        e = new Employee[4];
        e[0] = new Manager( 101, "John", "Smith", 45, 160, 5000, 5 );
        e[1] = new SalesManager( 102, "Anna", "Black", 36, 160, 25000, 0.1 );
        e[2] = new SalesManager( 103, "Thomas", "White", 28, 160, 30000, 0.1 );
        e[3] = new Worker( 104, "Gans", "Bauer", 30, 80, 5 );
        // добавим наши элементы массива в company
        for (int i = 0; i < e.length; i++) {
            company.addEmployee( e[i] );
        }

    }

    @Test
    void addEmployeeTest() {
// мы не можем добавить null
        assertFalse( company.addEmployee( null ) );
        // не может добавить уже существующий
        assertFalse( company.addEmployee( e[1] ) );
        Employee employee1 = new Manager( 105, "Ivan", "Dubin", 55, 160, 6000, 6 );// создали нового сотрудника
        assertTrue( company.addEmployee( employee1 ) );// добавили нового сотрудника
        assertEquals( 5, company.quantity() );// теперь в компании 5 сотрудников
        // создаем еще одного сотрудника
        Employee employee2 = new Manager( 106, "Peter", "Dubin", 55, 160, 6000, 6 );
        assertFalse( company.addEmployee( employee2 ) );// не может превысить capacity
    company.printEmployees();
    }

    @Test
    void removeEmployeeTest() {
        company.printEmployees();
        System.out.println("------------------------------------");
        assertEquals( e[1], company.removeEmployee( 102 ) );
        assertEquals( 3, company.quantity() );// сотрудников стало на один меньше
        assertNull( company.removeEmployee( 102 ) );// проверяем что нельзя удалить дважды
        assertNull( company.findEmployee( 102 ) );// проверяем что его нельзя найти
        company.printEmployees();
    }

    @Test
    void findEmployeeTest() {
        company.printEmployees();
        assertEquals( e[1], company.findEmployee( 102 ) );
        // ищем сотрудника которого нет
        assertNull( company.findEmployee( 105 ) );
    }

    @Test
    void quantityTest() {
        assertEquals( 4, company.quantity() );
    }

    @Test
    void totalSalaryTest() {
        assertEquals( 12100, company.totalSalary() );

    }

    @Test
    void avgSalaryTest() {
        assertEquals( 12100.0 / 4, company.avgSalary(), 0.01 );
    }

    @Test
    void totalSalesTest() {
        assertEquals( 55000, company.totalSales() );

    }

    @Test
    void printEmployeesTest() {
        company.printEmployees();
    }

   @Test
    void findEmployeesHoursGreaterThanTest(){
        Employee []actual = company.findEmployeesHoursGreaterThan( 100 );
        Employee [] expected = {e[0],e[1],e[2]};
        assertArrayEquals( expected,actual );

    }
    @Test
    void findEmployeesSalaryRangeTest(){

        Employee[]actual = company.findEmployeesSalaryRange(2900,6000 );
Employee[] expected = {e[0],e[2]};
assertArrayEquals( expected,actual );
        System.out.println(Arrays.toString(actual));

    }
}