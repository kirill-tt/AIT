package practice.citizens_treeset.citizens_v2.dao;

import practice.citizens_treeset.citizens_v2.model.Person;

import java.time.LocalDate;
import java.util.*;

public class CitizensHashSetImpl implements Citizens {

    //Сделать имплементацию Citizens на HashSet.
    // Чем она "хуже", чем на TreeSet,
    // которую мы сделали на занятии?
    private HashSet<Person> idList;
    private HashSet<Person> lastNameList;
    private HashSet<Person> ageList;

    private static Comparator<Person> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo( p2.getLastName() ); // сортировка по алфавиту по фамилиям
        return res != 0 ? res : Integer.compare( p1.getId(), p2.getId() ); // дополнительно по id
    };

    private static Comparator<Person> ageComparator = (p1, p2) -> {
        int res = Integer.compare( p1.getAge(), p2.getAge() ); // сортировка по кол-ву лет
        return res != 0 ? res : Integer.compare( p1.getId(), p2.getId() ); // дополнительно по id
    };

    public CitizensHashSetImpl() {
        idList = new HashSet<>(); // создаем
        lastNameList = new HashSet<>();
        ageList = new HashSet<>();
    }

    public CitizensHashSetImpl(List<Person> citizens) {
        this(); // вызов пустого конструктора
        for (Person person : citizens) {
            add( person );
        }
    }

    @Override
    public boolean add(Person person) {
        // Проверяет, что переданный объект person не равен null
        // И добавляет его в списки idList, lastNameList и ageList
        // Возвращает true, если person не равен null и успешно добавлен во все три списка
        return person != null && idList.add( person ) && lastNameList.add( person ) && ageList.add( person );
    }

    @Override
    public boolean remove(int id) {
        // Находит человека по заданному id
        Person person = find( id );
        // Возвращает результат удаления объекта person из списков idList, lastNameList и ageList
        // Возвращает true, если person не равен null и удаление выполнено из всех трех списков
        return person != null && idList.remove( person ) && lastNameList.remove( person ) && ageList.remove( person );
    }

    @Override
    public Person find(int id) {
        // Проход по всем персонам в idList
        for (Person person : idList) {
            //сравниваем id
            if (person.getId() == id) {
                return person; // Возвращает человека, если найден
            }
        }
        return null; // Возвращает null, если не найден
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        // Создание списка для хранения Person в заданном возрастном диапазоне
        List<Person> personsInRange = new ArrayList<>();
        // Проход по всем персонам в ageList
        for (Person person : ageList) {
            // Получение возраста текущей персоны
            int age = person.getAge();
            // Проверка, находится ли возраст персоны в заданном диапазоне
            if (age >= minAge && age <= maxAge) {
                // Добавление person в список, если ее возраст соответствует заданному диапазону
                personsInRange.add( person );

            }
        }
        // Возврат списка персон
        return personsInRange;
    }

    @Override
    public Iterable<Person> find(String lastName) {
        // Создание списка для хранения person с заданной фамилией
        List<Person> allPersons = new ArrayList<>();

        // Проход по всем персонам в lastNameList
        for (Person person : lastNameList) {
            // Проверка, соответствует ли lastName текущей персоны lastName
            if (person.getLastName().equals( lastName )) {
                // Добавление персоны в список, если ее фамилия совпадает с заданной
                allPersons.add( person );

            }
        }
        // Возврат списка
        return allPersons;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        // Возвращает idList
        return idList;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        // Создание нового списка из ageList
        List<Person> sortedByAge = new ArrayList<>( ageList );
        // Сортировка списка по возрасту с использованием Comparator
        sortedByAge.sort( Comparator.comparingInt( Person::getAge ) );
        // Возврат отсортированного списка
        return sortedByAge;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        // Создание нового списка из lastNameList
        List<Person> sortedByLastName = new ArrayList<>( lastNameList );
        // Сортировка списка по lastName с использованием Comparator
        sortedByLastName.sort( Comparator.comparing( Person::getLastName ) );
        // Возврат отсортированного списка
        return sortedByLastName;
    }


    @Override
    public int size() {
        // Возвращает размер списка, вызывая метод size()
        return idList.size();
    }
}

//Сортировка:
//HashSet не сохраняет порядок элементов, они хранятся в неопределенном порядке.
// TreeSet хранит элементы в отсортированном порядке с использованием компаратора или естественного порядка (если элементы реализуют интерфейс Comparable).

//Сложность операций:
// HashSet имеет временную сложность O(1) для большинства операций (добавление, удаление, поиск) в среднем случае, хотя может быть O(n) в худшем случае для поиска.
//TreeSet обеспечивает O(log n) для большинства операций (добавление, удаление, поиск), так как элементы хранятся в отсортированном порядке с использованием бинарного дерева.

//Дубликаты и уникальность:
//HashSet не допускает дубликатов и хранит только уникальные элементы.
//TreeSet также хранит только уникальные элементы, и они автоматически упорядочиваются.

//Память:
//HashSet требует меньше памяти, чем TreeSet, так как в TreeSet дополнительно хранится информация о порядке элементов.
//Таким образом, недостатком HashSet по сравнению с TreeSet является отсутствие гарантированной сортировки элементов и, в некоторых случаях, более высокая сложность поиска (в среднем). Однако HashSet может быть более эффективным с точки зрения производительности для операций добавления, удаления и поиска в среднем случае, особенно при больших объемах данных, где конкретный порядок элементов не критичен.

