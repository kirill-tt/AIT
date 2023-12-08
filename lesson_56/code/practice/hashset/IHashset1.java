package practice.hashset;

import java.util.Iterator;
import java.util.LinkedList;

public class IHashset1<E> implements ISet1<E> {
    //Fields

    private LinkedList<E>[] hashSet; // это массив из связаных листов
    // каждый элемент массива - это отдельный LinkedList с элементами <E>
    private int size;
    private int capacity;// количество ячеек
    private double loadFactor; // объем загрузки

    public IHashset1(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashSet = new LinkedList[capacity]; // это массив из Linkedlist
    }
     // в этом конструкторе можно определить loadFactor

    public IHashset1(int capacity){
        this(capacity,0.75);// eto loadFactor


    }

    // конструктор по умолчанию
    public IHashset1(){
        this(16, 0.75);
    }
    @Override
    public boolean add(E element) {
        if(size >= capacity * loadFactor){
            rebuildArray();
        }
        int index = getIndex( element );
        if(hashSet[index] == null){
            hashSet[index] = new LinkedList<>();

        }
        if(hashSet[index].contains( element )){
            return false;
        }

        hashSet[index].add( element );
        size ++;
        return true;
    }

    private void rebuildArray(){
        capacity = capacity * 2; // udvoili razmer
        LinkedList<E>[] newHashSet = new LinkedList[capacity];
        // надо оббегать весь hashset залезть в каждый его LinkedList
        for (int i = 0; i < hashSet.length; i++) {
            if (hashSet[i] != null) {
                for (E e : hashSet[i]) {
                    int index = getIndex(e);
                    if(newHashSet[index] == null){
                        newHashSet[index] = new LinkedList<>();// создаем новый лист
                    }
                    newHashSet[index].add( e ); // добавили элемент в LinkedList
                }
            }

        }
        hashSet = newHashSet; // переопределили ссылку, garbage collector очистить память
    }

    private int getIndex(E element){
        int hashCode = element.hashCode(); // вычисляем hashcode элемент
     hashCode = hashCode >= 0 ? hashCode : - hashCode;
     return hashCode % capacity; // деление с остатком
    }
    @Override
    public boolean contains(E element) {
        int index = getIndex(element);
        if(hashSet[index] == null){
            return false;

        }
        return hashSet[index].contains( element ); // проверяем наличие элемента
    }

    @Override
    public boolean remove(E element) {
        int index = getIndex( element );
        if(hashSet[index] == null){
            return false;
        }
        boolean res = hashSet[index].remove(element);
        if(res){
            size --;
        }
        return res;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int i;
            int j;
            int totalCounter;
            @Override
            public boolean hasNext() {
                return totalCounter < size; // пока есть куда двигаться
            }

            @Override
            public E next() {
                while (hashSet[i] == null || hashSet[i].isEmpty()){//если пусто
                    i++; // переходим к следующему
                }
                E res = hashSet[i].get( j );
                totalCounter++;
                if(j < hashSet[i].size() -1) {// находится внутри LinkedList
                    j++;
                }else {
                    j = 0;
                    i++;
                }
                return res;
            }
        };
    }
}
