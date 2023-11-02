package practice;

//Создайте массив и заполните его символами латинского алфавита от A до Z.
// Раcпечатайте полученный массив.

public class ArrayAlphabet {
    public static void main(String[] args) {

        // zapolnitj massiv ot 1 do 20
        int[] arrayNum = new int[20]; // objavili massiv

        for (int i = 0; i < arrayNum.length; i++) { // zapuskaem zikl
            arrayNum[i] = i + 1; // zapolnjaem elementi massiva
        }
        // zikl dlja pechati massiva
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print( arrayNum[i] + ", " );

        }
        System.out.println();
        System.out.println( "nullevoj po indeksu " + arrayNum[0] );
        System.out.println( "19 po indeksu " + arrayNum[19] );
        //System.out.println("20 po indeksu " + arrayNum[20]);
        //System.out.println("20 po indeksu " + arrayNum[20]); // vihod za predeli massiva

        char[] alphabet = new char[26];
        // zapolnenie
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (65 + i); // 65 eto kod boljschoj bukvi A latinskogo alfavita
            // (char) prividenie int k tipu char
            System.out.print(alphabet[i] + ", ");
        }
        // pechatj massiva
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print( alphabet[i] + " " );

        }
        System.out.println();
        System.out.println(alphabet);
    }
}
