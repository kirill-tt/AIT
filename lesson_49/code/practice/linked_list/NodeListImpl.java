package practice.linked_list;

import java.util.Iterator;

public class NodeListImpl <E> implements NodeList<E> {
    // Fields
    private Node<E> first;
    private Node<E> last;

    private int size;

// O(1)
    @Override
    public int size() {
        return size;
    }
//O(1)
    @Override
    public boolean add(E element) {// метод должен добавлять элемент в список
        Node<E> newNode = new Node<>(last, element, null); // создаем новый подписной узел
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode; //если список был пустой, то новый создаваемый становиться первым
        }
        last = newNode;
        size++;
        return true;// узел новый следующий в списке
    }
//O(1)
    @Override
    public void clear() {
        //TODO
        first = last = null;
        size = 0;
    }
//O(n)
    @Override
    public boolean add(int index, E element) {
        // Если индекс равен размеру списка, то добавляем элемент в конец списка
        if (index == size) {
            return add(element);
        }

        // Получаем узел по его индексу
        Node<E> node = getNodeByIndex(index);

        // Создаем новый узел, который будет вставлен в список
        Node<E> newNode = new Node<>(node.prev, element, node);

        // Обновляем связи между узлами
        node.prev = newNode;

        // Если индекс не равен 0, обновляем ссылку на следующий узел у предыдущего узла
        if (index != 0) {
            newNode.prev.next = newNode;
        } else {
            // Если индекс равен 0, обновляем first на новый узел
            first = newNode;
        }

        // Увеличиваем размер списка
        size++;

        // Возвращаем true, чтобы указать успешное добавление элемента
        return true;
    }
//O(n)
    private Node<E> getNodeByIndex(int index) {
        checkIndex(index); // Проверка индекса

        Node<E> node; // Объявление переменной для узла
        if (index < size / 2) { // Проверка: находится ли индекс в первой половине списка
            node = first; // Если индекс в первой половине, начинаем поиск с начала списка
            for (int i = 0; i < index; i++) { // Цикл от начала до указанного индекса
                node = node.next; // Переходим к следующему узлу
            }
        } else { // Если индекс во второй половине списка или далее
            node = last; // Начинаем поиск с конца списка
            for (int i = size - 1; i > index; i--) { // Цикл от конца списка до указанного индекса
                node = node.prev; // Переходим к предыдущему узлу
            }
        }
        return node; // Возвращаем узел, соответствующий указанному индексу
    }

    //
    // Проверка корректности переданного индекса
    private void checkIndex(int index) {
        // Проверяем, находится ли индекс в пределах допустимого диапазона
        if (index < 0 || index >= size) {
            // Если индекс выходит за границы, выбрасываем исключение IndexOutOfBoundsException с переданным индексом
            throw new IndexOutOfBoundsException(index);
        }
    }
//O(n)
    // Получение элемента списка по указанному индексу
    @Override
    public E get(int index) {
        // Получаем узел списка по указанному индексу с помощью метода getNodeByIndex(index)
        Node<E> node = getNodeByIndex(index);
        // Возвращаем данные (значение) из узла, соответствующего указанному индексу
        return node.data;
    }
//O(n)
    @Override
    public int indexOf(Object o) {
        int index = 0; // Инициализация переменной index, которая будет хранить индекс элемента
        if (o != null) { // Проверка, что объект o не является null
            for (Node<E> node = first; node != null; node = node.next, index++) {
                // Начало цикла: инициализация node как первого элемента списка,
                // продолжение цикла до тех пор, пока node не станет null,
                // переход к следующему элементу (node = node.next), инкремент индекса (index++)
                if (o.equals(node.data)) { // Проверка: если объект o равен текущему элементу списка (node.data)
                    return index; // Возвращает индекс текущего элемента
                }
            }
        } else { // В случае, если объект o равен null
            for (Node<E> node = first; node != null; node = node.next, index++) {
                // Аналогичный цикл, но с проверкой на равенство null через ==
                if (o == node.data) { // Проверка: если объект o равен null (node.data)
                    return index; // Возвращает индекс текущего элемента
                }
            }
        }
        return -1; // Если объект o не найден в списке, возвращает -1, что указывает на отсутствие объекта в списке
    }
// O(n)
    @Override
    public int lastindexOf(Object o) {

//TODO

    int lastIndex = -1; // Инициализируем индекс -1, чтобы обозначить отсутствие объекта
    int index = 0; // Индекс текущего элемента, начинаем с нуля

    if (o != null) { // Проверяем, что объект не null
        for (Node<E> node = first; node != null; node = node.next, index++) {
            if (o.equals(node.data)) { // Если объект равен текущему элементу списка
                lastIndex = index; // Обновляем индекс последнего встреченного объекта
            }
        }
    } else { // В случае, если объект o равен null
        for (Node<E> node = first; node != null; node = node.next, index++) {
            if (node.data == null) { // Проверяем, если текущий элемент списка равен null
                lastIndex = index; // Обновляем индекс последнего встреченного объекта
            }
        }
    }

    return lastIndex; // Возвращаем индекс последнего вхождения объекта o или -1, если объект не найден
}
//O(n)
    @Override
    public E remove(int index) {
        // Получаем узел списка по указанному индексу с помощью метода getNodeByIndex(index)
        Node<E> node = getNodeByIndex(index);
        // Вызываем метод unlink(node) для удаления узла и получения удаленного значения
        return unlink(node);
    }

//O(1)
    private E unlink(Node<E> node) {
        // Сохраняем данные удаляемого узла
        E victim = node.data;

        // Получаем ссылки на предыдущий и следующий узлы от удаляемого узла
        Node<E> prev = node.prev;
        Node<E> next = node.next;

        // Если есть предыдущий узел от удаляемого узла
        if (prev != null) {
            prev.next = next; // Устанавливаем ссылку предыдущего узла на следующий узел от удаляемого
            node.prev = null; // Обнуляем ссылку на предыдущий узел удаляемого
        } else {
            first = next; // Если удаляемый узел первый в списке, обновляем ссылку на первый узел
        }

        // Если есть следующий узел после удаляемого узла
        if (next != null) {
            next.prev = prev; // Устанавливаем ссылку следующего узла на предыдущий узел от удаляемого
            node.next = null; // Обнуляем ссылку на следующий узел удаляемого
        } else {
            last = prev; // Если удаляемый узел последний в списке, обновляем ссылку на последний узел
        }

        node.data = null; // Очищаем данные удаляемого узла
        size--; // Уменьшаем размер списка
        return victim; // Возвращаем данные удаленного узла
    }

    //O(n)
    @Override
    public E set(int index, E element) {
        // Получаем узел списка по указанному индексу с помощью метода getNodeByIndex(index)
        Node<E> node = getNodeByIndex(index);
        // Сохраняем текущее значение элемента для возврата (victim)
        E victim = node.data;
        // Заменяем значение в узле на новое значение element
        node.data = element;
        // Возвращаем предыдущее значение элемента
        return victim;
    }

    //O(1)
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            Node<E> current = first;

            // Проверка наличия следующего элемента
            @Override
            public boolean hasNext() {
                return current != null;
            }

            // Получение данных из текущего узла и переход к следующему узлу
            @Override
            public E next() {
                // Получаем данные из текущего узла
                E data = current.data;
                // Переходим к следующему узлу
                current = current.next;
                // Возвращаем данные текущего узла
                return data;
            }
        };
    }
}