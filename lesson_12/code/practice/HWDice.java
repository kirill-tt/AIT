package practice;

// Бросьте кубик с 6-ю гранями 20 раз.
// Подсчитайте, сколько раз выпала каждая цифра.
public class HWDice {
    public static void main(String[] args) {
        int[] rolling = new int[20]; // Array dice roll
        int[] dice = new int[6]; // Array dice with six sides from 1 to 6

        for (int i = 0; i < rolling.length; i++) { // Cycle of rolling the dice
            int roll = (int) ((Math.random() * 6) + 1); // Generate a number from 1 to 6( roll dice)
            rolling[i] = roll; // Write down the result of the dice roll to an array rolling
            dice[roll - 1]++; // Increase the counter
        }
        for (int i = 0; i < dice.length; i++) { // display the result and print
            System.out.println( "The number " + (i + 1) + " is dropped " + dice[i] + " times!" );

        }
    }
}
