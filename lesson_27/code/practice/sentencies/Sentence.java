package practice.sentencies;

public class Sentence {
    // count words in Sentence
    public  int countWords(String str) {
        String[] words = str.split(" ");
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("–") || words[i].equals( "-" ) || words[i].equals(",")||words[i].equals(".") ||words[i].equals(" ") ||words[i].equals("  ") ||words[i].equals("?") ||words[i].equals("!") ||words[i].equals(":") ||words[i].equals(";") ||words[i].equals("(") ||words[i].equals(")") ||words[i].equals(":(") ||words[i].equals("%") ||words[i].equals("&") ||words[i].equals("^")){
                n++;
            }
        }
        //System.out.println(words.length);
        //System.out.println(n);
        return words.length - n;
    }

    // count symbols in Sentence
     public int countSymbols(String str) {
        String[] symbols= str.split("");


        int n = 0;
        for (int i = 0; i < symbols.length; i++) {
            if ( symbols[i].equals("&")||symbols[i].equals(" ")|| symbols[i].equals(".") ||symbols[i].equals(",") ||symbols[i].equals("?")|| symbols[i].equals("-")|| symbols[i].equals("–")|| symbols[i].equals("!")|| symbols[i].equals(":")||symbols[i].equals(";")||symbols[i].equals("(")|| symbols[i].equals(")")||symbols[i].equals("%")||symbols[i].equals(":(")) {
                n++;
            }
        }

        return symbols.length - n;
    }  ///TODO исключить пробелы из результата метода


    //Это регулярное выражение "[\\s,.;?!:;()]+" разделяет строку на слова, учитывая пробелы, запятые, точки с запятой, вопросительные и восклицательные знаки, двоеточия и скобки как разделители
    public int countWords1(String str) {
        str.trim();
        String[] words = str.split("[\\s,.;?!:;()]+");
        return words.length;
    }
    //Этот метод использует регулярное выражение "[^a-zA-Z]", чтобы удалить все символы, кроме букв (как прописных, так и заглавных), затем возвращает количество оставшихся букв.
    public int countSymbols1(String str) {
        str.trim();
        String lettersOnly = str.replaceAll("[^a-zA-Z]", "");
        return lettersOnly.length();
    }
    }


