package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphabeticalOrder {

    public List<String> sortInAlphabeticalOrder(String str){

        String[] strArray = str.split(" ");

        List<String> strList = new ArrayList<String>();

//        make into a list
        for (String string: strArray){

            strList.add(string);

        }

//        sort the list
        Collections.sort(strList);

        return strList;

    }

    public static void main(String[] args) {

        AlphabeticalOrder alphabeticalOrder = new AlphabeticalOrder();

//        sort in alphabetical order
        List<String> strList = alphabeticalOrder.sortInAlphabeticalOrder("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");

        for (String string : strList)

            System.out.println(string);

    }

}
