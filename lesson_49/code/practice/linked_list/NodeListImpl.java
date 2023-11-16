package practice.linked_list;

import java.util.Iterator;

public class NodeListImpl <E> implements NodeList<E> {
    // Fields
    private Node<E> first;
    private Node<E> last;

    private int size;


    @Override
    public int size() {
        return size();
    }

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

    @Override
    public void clear() {
        //TODO
        first = null;
        last = null;
        size = 0;
    }

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

    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;

    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
            }
        }


    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastindexOf(Object o) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}