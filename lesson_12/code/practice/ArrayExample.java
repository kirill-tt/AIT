package practice;
//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
// Найдите минимальный элемент массива и его индекс.
// Напечатайте все элементы массива с НЕчетными индексами.
// Найдите произведение всех четных элементов массива.


public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {75, -250, -15, -123, 57, -145, 86, -250, 48, -251};
        int m = minElOfArray( array );
        minElOfArray(array);
        System.out.println(" Min element of aaray is: " + m);

        int i = minElOfArrayIndex(array);
        System.out.println("Index of min element of aaray is: " +i);


    }// end of main========
    // ========Method===========

    public static int minElOfArrayIndex (int [] array){
        // probegaem po vsemu massivu,
        // kagdij element sravnim s minimaljnim znacheniem
        // esli element budet menjsche min, to delaem min = etomu elementu
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){// esli element massiva s indeksom i menjsche minimum
                min = array[i];
                indexMin = i;

            }

        }
        return indexMin;
    }



    public static int minElOfArray (int [] array){
        // probegaem po vsemu massivu, 
        // kagdij element sravnim s minimaljnim znacheniem
        // esli element budet menjsche min, to delaem min = etomu elementu
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){// esli element massiva s indeksom i menjsche minimum
             min = array[i];

            }
            
        }
        return min;
    }



    //==========end of methods========

}
