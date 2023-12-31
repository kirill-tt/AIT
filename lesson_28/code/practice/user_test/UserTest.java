package practice.user_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.User;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;
    final String email = "peter@gmail.com";// final переменная не меняется
    final String password = "12345Az!";// final переменная не меняется

    @BeforeEach
    void setUpTest() {
        user = new User( email,password);// перед каждым тестом
    }

    @Test
    void testCorrectEmail() {
        user.setEmail( "peter@yahoo.com" );// устанавливаем новый e-mail
        assertEquals( "peter@yahoo.com",user.getEmail() );

    }

    @Test
    void setWithoutAt() {
        user.setEmail( "peter.yahoo.com" );
        assertEquals( email, user.getEmail() );// esli oni sovpadut eto znachit
    }

}