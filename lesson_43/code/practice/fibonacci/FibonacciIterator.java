package practice.fibonacci;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private int quantity; // Количество чисел, которые должны быть сгенерированы
    private int count; // Текущий счетчик чисел
    private int firstNumber = 0; // Первое число
    private int secondNumber = 1;// Второе число

    //constructor
    public FibonacciIterator(int quantity) {
        this.quantity = quantity;
    }

    //TODO проверка на количество чисел в ряду
    @Override
    public boolean hasNext() { // проверка на количество чисел в ряду
        return count <= quantity;
    }

    // TODO как получить следующее число в ряду = предыдущее плюс текущее

    //// Получение следующего числа в ряду (предыдущее число + текущее число)
    @Override
    public Integer next() {
        if (count == 0) { // Если count равен 0, то это начало последовательности Fibonacci
            count++; // устанавливаем count в 1 и возвращаем первое число, которое всегда равно 1.
            return 1; // Первое число в ряду Fibonacci
        }

        int nextNumber = firstNumber + secondNumber; // Вычисление следующего числа
        firstNumber = secondNumber; // Обновление первого числа
        secondNumber = nextNumber; // Обновление второго числа
        count++; // Текущий счетчик чисел
        return nextNumber; // Возврат сгенерированного числа

    }
}
