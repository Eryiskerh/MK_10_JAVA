package alyaseva;

import java.util.Scanner;

public class StringSplitter {
    public StringSplitter(){

    }
    public static String[] Split(String arg){
        final int maxWords= 100;
        String[] splitWords = new String[maxWords];       // splitted sentence
        StringBuilder word = new StringBuilder();           // splitted word in char[]
        int countWords = 0;                                 // count of words in sentence

        // Enter sentence
        char[] enteredWords = arg.toCharArray();

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
            splitWords[countWords++] = word.toString();

        String[] retArr = new String[countWords];
        for(int i=0; i<countWords; i++){
            retArr[i] = splitWords[i];
        }
        //   out splitted sentence
        return retArr;
    }
}
