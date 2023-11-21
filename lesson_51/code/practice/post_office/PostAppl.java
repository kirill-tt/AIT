package practice.post_office;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PostAppl {
    public static void main(String[] args) {
        //**Задача:** Написать приложение, которое позволит понять,
        // из каких мест на данную почту приходят письма.

        // Operator budet vvodity indexi iz prixodyashih pisem budem ix zanosity v Hash set
        Set<String> postCode = new HashSet<>();
        do {
            System.out.println( "Welcome to Post office. " );

            Scanner scanner = new Scanner( System.in );
            System.out.println( "Input Post code: " );
            String newPostCode = scanner.nextLine();
            if (postCode.add( newPostCode )) {
                System.out.println( "Post code added ." );
            } else {
                System.out.println( "Post code already exists" );
            }
            System.out.println( "Continue? Press S to stop." );
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase( "s" )){
                break;
            }

        } while (true);

        System.out.println("Post codes: ");
        System.out.println(postCode);
    }
}