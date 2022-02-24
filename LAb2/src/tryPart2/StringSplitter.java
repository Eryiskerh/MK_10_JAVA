package tryPart2;
import java.util.Scanner;


// my brother andy is very lazy boy
public class StringSplitter {
    public static void main(String[] args) {
        final int maxWords= 100;
        String[] splitWords = new String[maxWords];       // splitted sentence
        StringBuilder word = new StringBuilder();           // splitted word in char[]
        int countWords = 0;                                 // count of words in sentence

        // Enter sentence
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text to split it");
        char[] enteredWords = input.nextLine().toCharArray();

        // split sentence
        for (int i=0; i<enteredWords.length; i++) {
            if (enteredWords[i] != ' ' && enteredWords[i] != '\t' && enteredWords[i] != '\r' && enteredWords[i] != '\n') {
                word.append(enteredWords[i]);
            }
            else if (word.length() != 0){
                splitWords[countWords++] = word.toString();
                word = new StringBuilder();
            }
        }
        if (word.length() != 0)
            splitWords[countWords] = word.toString();

        //   out splitted sentence
        for(int i=0; splitWords[i] != null ; i++)
            System.out.println(splitWords[i]);
    }
}
