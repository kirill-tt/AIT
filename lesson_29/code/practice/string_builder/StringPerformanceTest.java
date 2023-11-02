package practice.string_builder;

public class StringPerformanceTest {
     // String immutable
    private static final int N_ITERATION = 100_000;// определяет константу
    private static final String WORD = "Word";// определяет константу

    // константы определяются до main

    public static void main(String[] args) {
        // String
     String str = "";// инициировали пустую строку
     long t1 = System.currentTimeMillis();// засекаем время
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;

        }
        long t2 = System.currentTimeMillis();// вторая засечка времени
        System.out.println(t2-t1);// стольку времени прошло в миллисекундах

        // StringBuilder - mutable
        StringBuilder stringBuilder = new StringBuilder("");
        t1 = System.currentTimeMillis();// засекаем время
        for (int i = 0; i < N_ITERATION; i++) {
            stringBuilder.append( WORD );

        }
        str = stringBuilder.toString();
        t2 = System.currentTimeMillis();// вторая засечка времени
        System.out.println(t2-t1);// стольку времени прошло в миллисекундах

    }
}
