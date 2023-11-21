package citizen.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private String firstnName;
    private String lastName;
    private LocalDate birthday;

    public Person(int id, String firstnName, String lastName, LocalDate birthday) {
        this.id = id;
        this.firstnName = firstnName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstnName() {
        return firstnName;
    }

    public void setFirstnName(String firstnName) {
        this.firstnName = firstnName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash( id );
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstnName='" + firstnName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
    public int getAge(){
        LocalDate currentYear = LocalDate.now();// определили текущий год
        // вычитаем из текущего дату рождения
        int age = (int) ChronoUnit.YEARS.between( currentYear, birthday );
   return age;

    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare( this.id, o.id );
    }
}
