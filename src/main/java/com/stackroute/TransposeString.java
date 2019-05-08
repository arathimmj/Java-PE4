package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransposeString {

//    find the transpose of a string
    public String transpose(String str){

        List<Character> strList = new ArrayList<Character>();

//        make the string into a list of characters
        for(char ch : str.toCharArray()){

            strList.add(ch);

        }

//        reverse the list
        Collections.reverse(strList);

        String finalString = new String();
        for (Character c : strList)
            finalString = finalString + c;

        return finalString;

    }

    public static void main(String[] args) {

        String str = "a quick brown fox jumps over the lazy dog";

//        make the string into an array of strings
        String[] strArray = str.split(" ");

        TransposeString transposeString = new TransposeString();

//        find transpose of each string in array
        for (int i = 0; i<strArray.length;i++)
            strArray[i] = transposeString.transpose(strArray[i]);

        String finalString = new String();

//        remake into a string
        for (String string  : strArray)
            if (finalString == "")
                finalString = finalString + string;
            else
                finalString = finalString + " " + string;

//            print results
        System.out.println("Reverse of the given string is : " + finalString);

    }

}
