package citizen.dao;

import citizen.model.Person;

public interface Citizen {
    boolean add (Person person);
    boolean remove (int id);
    Person find (int id);
    Iterable<Person> find (int minAge, int maxAge); // список граждан в возрасте от и до
    Iterable<Person> find (String lastName);// найти по фамилии
    Iterable<Person> getAllPersonsSortedById();// отсортированные по Id
    Iterable<Person> getAllPersonsSortedByAge();// отсортированные по возрасту
    Iterable<Person> getAllPersonsSortedByLastName();// отсортированные по фамилии
    int size ();
}
