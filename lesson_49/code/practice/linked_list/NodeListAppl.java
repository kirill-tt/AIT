package practice.linked_list;

public class NodeListAppl {
    public static void main(String[] args) {
        // создадим список из целых чисел
        NodeListImpl<Integer> listNumbers = new NodeListImpl<>();
        System.out.println(listNumbers.size());
        System.out.println(listNumbers.isEmpty());


listNumbers.add( 100 );
        listNumbers.add( 200 );
        listNumbers.add( 300 );
        listNumbers.add( 400 );
        System.out.println(listNumbers.size());
        System.out.println(listNumbers.isEmpty());

        // вставить 250 под индексом 2
        listNumbers.add( 2,250 );
        for (Integer n : listNumbers){
            System.out.print(n + " | ");
        }
        System.out.println();
        //udalim uzel 300
        listNumbers.remove( 1 );
        for (Integer n : listNumbers){
            System.out.print(n + " | ");
        }
        System.out.println();
listNumbers.add( 4,null );
        for (Integer n : listNumbers){
            System.out.print(n + " | ");
        }
        System.out.println();





        //создадим список из строк
    }
}
