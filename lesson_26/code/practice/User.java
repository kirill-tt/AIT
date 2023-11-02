package practice;
 //kes99@mail.ru

/*
1) @ exists and only one -> @ только одна
2) dot after @  -> после @ должна быть среди символов как минимум одна точка
3) after last dot minimum 2 symbols -> после последней точки должно быть минимум 2 символа
4) alphabetic, digits, _ , - , . , @ -> разрешены буквы алфавита, цифры и некоторые символы
 */

import java.util.Objects;

public class User {
    // поля класса
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail( email );
        setPassword( password );
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail( email )) {
            this.email = email;
        } else {
            System.out.println( email + " isn't valid." );
        }
    }

    private boolean validateEmail(String email) {
        // k_l_b_1963@hotmail.com
        int indexAt = email.indexOf( '@' ); // ищем индекс @
        if (indexAt <= 0 || indexAt != email.lastIndexOf( '@' )) { // проверяем наличие @ и что она только одна
            return false; // тогда вернем false
        }
        if (email.indexOf( '.', indexAt ) == -1) { // не нашлась точка, начиная с позиции @
            return false;
        }
        if (email.indexOf( '.' ) >= email.length() - 2) { // более 1-го символа после точки
            return false;
        }
        for (int i = 0; i < email.length(); i++) { // проверка на допустимые символы
            char c = email.charAt( i );
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (validatePassword( password )) {
            this.password = password;
        } else {
            System.out.println( "Password not valid" );
        }
    }
    /*
    1) min 8 symbols
    2) min one symbol of uppercase
    3) min one symbol of lowercase
    4) min one digit
    5) min one special symbol (!%@*&)
     */


    // метод с массивом boolean
    private boolean validatePassword(String password) {

        if (password == null || password.length() < 8) { // Проверяем, не является ли пароль пустым или короче 8 символов
            return false;   // Пароль недопустим, если он не соответствует минимальной длине
        }
        // Создаем массив для отслеживания выполнения каждого критерия (заглавная буква, строчная буква, цифра, специальный символ)
        boolean[] checkArray = new boolean[4];
        for (int i = 0; i < password.length(); i++) {//пробегаем по массиву
            char c = password.charAt( i ); // Получаем символ из строки пароля по индексу i
            if (Character.isUpperCase( c )) { // проверяем заглавную букву
                checkArray[0] = true;
            } else if (Character.isLowerCase( c )) { // проверяем строчную букву
                checkArray[1] = true;
            } else if (Character.isDigit( c )) { // проверяем цифру
                checkArray[2] = true;
            } else if ("!%@*&".indexOf( c ) != -1) { // проверяем специальный символ
                checkArray[3] = true;
            }

        }
        // Пароль допустим, только если все четыре значения true
        return checkArray[0] && checkArray[1] && checkArray[2] && checkArray[3];
    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;

        if (!email.equals( user.email )) return false;
        return password.equals( user.password );
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
