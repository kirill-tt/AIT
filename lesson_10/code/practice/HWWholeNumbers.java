package practice;
//Задан массив целых чисел:
// 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
// Найдите максимальный элемент массива и его индекс.
public class HWWholeNumbers {
    public static void main(String[] args) {
        int[] wholeNumbers = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int maxnum = wholeNumbers[0];
        int maxIndex = 0;
        for (int i = 1; i < wholeNumbers.length; i++) {
            if (wholeNumbers [i] > maxnum){
                maxnum = wholeNumbers [i];
                maxIndex = 1;
            }

            
        }
        System.out.println( "maxelement: " +maxnum);
        System.out.println("Index maxelement: " + maxIndex);
    }
}
