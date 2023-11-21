package practice.fibonacci;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{
    private int quantity;// количество чисел в последовательности

    public Fibonacci(int quantity) {
        this.quantity = quantity -1; // Устанавливаем количество чисел, уменьшенное на 1, чтобы начать с 1
    }


    public void setQuantity(int quantity) { // Устанавливаем количество чисел
        this.quantity = quantity;
    }

    @Override
    public Iterator<Integer> iterator() { //TODO
        return new FibonacciIterator(quantity); // Возвращаем новый итератор
    }
}
