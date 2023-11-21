package practice.ilist;

// зададим абстрактные методы
// для работы со структурами данных
// которая называется list (список чего-то)
// для данные типы Integer, String, StringBuilder, Employee, Car, Pet, Photo, Book...
public interface Ilist<E> extends Iterable<E> {
    int size(); // узнать размер списка

    default boolean isEmpty()// если он пустой true
    {

        return size() == 0;
    }

    void clean();// удалить всё из списка

    boolean add(E element);// добавить элемент списка

    default boolean contains(Object o)// есть ли элемент в списке
    {
        return indexOf( o ) >= 0;
    }

    default boolean remove(Object o)// удалить элемент по его индексу если он есть в списке
    {
        int index = indexOf( o );
        if (index < 0) {// когда объекта нет в списке
            return false;
        }
        remove( index );
        return true;
    }

    boolean add(int index, E element);// вставить элемент по индексу

    E remove(int index);// удалить элемент из списка по индексу

    E get(int index);// получить найти элемент по индексу

    E set(int index, E element);// обновить элемент в списке по его индексу

    int indexOf(Object o);// зная элемент найти его индекс

    int lastIndexOf(Object o); // найти элемент с конца списка


}
