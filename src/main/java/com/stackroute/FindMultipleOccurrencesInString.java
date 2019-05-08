package com.stackroute;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMultipleOccurrencesInString {

//    fint the multible occurences of a pattern string in a text
    public HashMap<Integer,Integer> findOccurrence(String text, String patternString){

        HashMap<Integer,Integer> hm = new HashMap<>();

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {

            hm.put(matcher.start(),  matcher.end());

        }

        return hm;

    }

    public static void main(String[] args) {

        FindMultipleOccurrencesInString findMultipleOccurrencesInString = new FindMultipleOccurrencesInString();

        HashMap<Integer,Integer> hm = new HashMap<>();

        String text    =
                "This is the text which is to be searched " +
                        "for occurrences of the word 'is'.";

        String patternString = "is";

//        get the start and end of the occurrence
        hm = findMultipleOccurrencesInString.findOccurrence(text, patternString);

//        print the results
        for(Map.Entry m:hm.entrySet()){
            System.out.println("Found at: "+m.getKey()+"-"+m.getValue());
        }

    }

}
