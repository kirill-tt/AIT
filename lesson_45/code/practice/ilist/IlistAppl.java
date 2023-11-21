package practice.ilist;

public class IlistAppl {
    public static void main(String[] args) {
        // список с целыми числами
        Ilist<Integer> list = new IlistImpl<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add( 10 );
        list.add( 20 );
        list.add( 30 );
        list.add( 40 );
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.indexOf( 30 );
        System.out.println(list.indexOf( 30 ));;
    }
}
