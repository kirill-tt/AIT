package practice;

import java.util.Scanner;

//Написать бот, который задет не менее 3-х вопросов (последовательно), принимает ответы от пользователя и реагирует на эти ответы.
// Пример: Как вас зовут? Очень приятно, меня зовут Бот1.
// Какой у вас вес? 106 кг.
// А какой рост? А какой возраст?
// ... Варианты ответов..., которые отвечает бот.
public class HWbBotAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Hello!\n" + "I`m your personal assistant\n" + "Ask your question:" );
        String question = scanner.next();
        switch (question) {
            case "what-can-you-do?" ->
                    System.out.println( "I`m a new development, I don`t know much yet, but I can help you" );
        }
        System.out.println( "Ask the next question: " );
        String question1 = scanner.next();
        switch (question1) {
            case "What-day-of-the-week-is-it-today?" -> System.out.println( "Today is Wednesday" );
        }
        System.out.println( "Ask the next question: " );
        String question2 = scanner.next();
        switch (question2) {
            case "When`s-your-birthday?" ->
                    System.out.println( "My birthday is 13.09.2023\n" + "and on this day they celebrate Programmer´s Day" );
        }
        System.out.println( "Ask the next question: " );
        String question3 = scanner.next();
        switch (question3) {
            case "What-time-should-I-do-this-evening?" ->
                    System.out.println( "Today is Programmer´s Day and my birthday!\n" + "I think it´s worth celebrating!!!" );
        }
    }
}


    

