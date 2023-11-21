package practice.linked_list;

public class Node <E>{
    // Fields
    Node<E> prev; // tip Node взялся ot Java
    E data;
    Node<E> next;

    // Constructor

    public Node(Node<E> prev, E data, Node<E> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "prev=" + prev +
                ", data=" + data +
                ", next=" + next +
                '}';
    }
}
