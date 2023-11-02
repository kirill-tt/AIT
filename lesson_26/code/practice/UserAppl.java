package practice;

public class UserAppl {
    public static void main(String[] args) {
User user = new User( "peter@mail.com", "Ab34567*" ); // создаем полизователя
        System.out.println(user);// печати
        System.out.println("----------------------------------------------");
        User user1 = new User( "peter@gmai.com", "ASc12345**" );
        System.out.println(user1);
        System.out.println("----------------------------------------------");
        user.setEmail( "peter@mail.com" );

    }
}

