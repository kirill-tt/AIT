package practice.mystring.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character>{

   private StringBuilder str;
   private int size;
   private int currPosition;
// constructor

    public MyStringIterator(StringBuilder str) {
        this.str = str;
        this.size = str.length();
        //this.currPosition = currPosition;
    }
// проверка есть ли следующий элемент
    @Override
    public boolean hasNext() {
        return currPosition < size;// логическое выражение true -значит еще есть элементы множества
    }

    @Override
    public Character next() {
        Character curCharacter = str.charAt( currPosition );
        currPosition++;
        return curCharacter;
    }
    // метод для удаления элемента строки
    public void remove(){
        str.deleteCharAt( --currPosition );
        size--;
    }
}

