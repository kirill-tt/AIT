package practice.ilist;
// зададим абстрактные методы
// для работы со структурами данных
// которая называется list (список чего-то)
// для данные типы Integer, String, StringBuilder, Employee, Car, Pet, Photo, Book...
public interface Ilist <E>{
   int size (); // узнать размер списка
    boolean isEmpty();// есть ли что-то в списке или он пустой
    void clean ();// удалить всё из списка
    boolean add(E element);// добавить элемент списка
    boolean contains(Object o);// есть ли элемент в списке
    boolean remove(Object o);// удалить элемент если он есть в списке
    // вставить элемент по индексу

    // удалить элемент из списка по индексу
    // обновить элемент в списке по его индексу

    // найти элемент по индексу
    // зная элемент найти его индекс

    // найти элемент с конца списка



}
