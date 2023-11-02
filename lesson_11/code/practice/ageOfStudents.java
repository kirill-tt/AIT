package practice;

//Создайте массив, который содержит возраст студентов группы.
//какой возраст максимальный?
//какой возраст минимальный?
//есть ли однокурсники с одинаковым возрастом? Если да, то сколько студентов, у которых одинаковый возраст?
public class ageOfStudents {
    public static void main(String[] args) {
        int[] ageOfStudent = {30, 18, 45, 52, 43, 25, 61, 38, 40, 35, 36, 45, 47, 34, 29, 22, 18};
        // ischem maksimaljnij element massiva

        int max = ageOfStudent[0]; // eto pervij kandidat na maximum
        int indexMax = 0;
        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent[i] > max) {// kogda tekuschij element massiva budet boljsche chem max
                max = ageOfStudent[i];// vzjali mximaljnij element
                indexMax = i;// vzjali ego index
            }

        }
        System.out.println( "Max age : " + max );
        System.out.println( "Index of max element :" + indexMax );

        int min = ageOfStudent[0]; // eto pervij kandidat na minimum
        int indexMin = 0;

        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent[i] < min) {// kogda tekuschij element massiva budet menjsche chem min
                min = ageOfStudent[i];// vzjali minimaljnij element
                indexMin = i;// vzjali ego index
            }
        }
        System.out.println( "Min age : " + min );
        System.out.println( "Index of min element :" + indexMin );

        // ischem dublikati
        // idem po vsem elementam massiva nachinaya s 0 i dlja nego ischem sovpadenja
        // otvet vigljadit tak: estj dublikat ego index takoj, vsego takix dublikatov..
        int duplikate = ageOfStudent[0]; // kandidat na dublikat
        int dCount = 0;// schetchik dublikatov
        int index = 0;

        for (int i = 0; i < ageOfStudent.length -1; i++) {
            for (int j = i +1; j < ageOfStudent.length; j++) {// nachinaem poisk so sledujuschego
                if(ageOfStudent[i] == ageOfStudent[j]){
                    duplikate = ageOfStudent[i];
                    dCount ++;
                    index  = j;// TODO vozmogno index += j;

                    System.out.println("Duplikate : " +duplikate + " index. " + index );
                    System.out.println("Quality of duplikate" +dCount);
                }

            }

        }

    }
}