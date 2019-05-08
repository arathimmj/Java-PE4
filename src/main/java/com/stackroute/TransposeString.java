package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransposeString {

    public String transpose(String str){

        List<Character> strList = new ArrayList<Character>();

        for(char ch : str.toCharArray()){

            strList.add(ch);

        }

        Collections.reverse(strList);

        String finalString = new String();
        for (Character c : strList)
            finalString = finalString + c;

        return finalString;

    }

    public static void main(String[] args) {

        String str = "a quick brown fox jumps over the lazy dog";

        String[] strArray = str.split(" ");

        TransposeString transposeString = new TransposeString();

        for (int i = 0; i<strArray.length;i++)
            strArray[i] = transposeString.transpose(strArray[i]);

        String finalString = new String();

        for (String string  : strArray)
            if (finalString == "")
                finalString = finalString + string;
            else
                finalString = finalString + " " + string;

        System.out.println("Reverse of the given string is : " + finalString);

    }

}
