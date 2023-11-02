package practice;

//Имеются оценки абитуриента из его аттестата, всего 20 оценок.
// Найдите средний балл абитуриента.

public class Abiturient {
    public static void main(String[] args) {
// objavili massiv i zapolnili
        int[] marks = {2, 3, 3, 1, 4, 1, 3, 2, 1, 1, 3, 2};
        int sumOfmarks = 0;

        for (int i = 0; i < marks.length; i++) {
            //sumOfmarks = sumOfmarks + marks[i];// dlinno no ponjatno
            sumOfmarks += marks[i];// korotkaya zapisj
        }

        double averageMark = (double)sumOfmarks / marks.length;
        System.out.println("Average mark:" + averageMark);
        System.out.printf("Average mark: %.2f", averageMark);
    }
}

