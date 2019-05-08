package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CharacterOccurrenceWithoutLoop {

    public int checkOccurrence(String string, char ch){

        int count = 0;

        char[] charArray = string.toCharArray();

        List<Character> charList = new ArrayList<Character>();

//        move the array into list
        for (Character character: charArray){

            charList.add(character);

        }

//        find the frequency of occurrency
        int occurrences = Collections.frequency(charList, ch);

        return occurrences;

    }

    public static void main(String[] args) {
        CharacterOccurrenceWithoutLoop characterOccurrenceWithoutLoop = new CharacterOccurrenceWithoutLoop();

        System.out.println(characterOccurrenceWithoutLoop.checkOccurrence("arathi", 'a'));

    }

}
