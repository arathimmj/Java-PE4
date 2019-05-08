package com.stackroute;

public class CheckIfPresent {

//    check if a string is a substring of anothen string
    public boolean checkIfSubstring(String string, String str){

        return string.contains(str);

    }

    public static void main(String[] args) {

        CheckIfPresent checkIfPresent = new CheckIfPresent();

//        print the output
        if (checkIfPresent.checkIfSubstring("This is Harry.", "Harry"))
            System.out.println("Present");
        else
            System.out.println("Absent");

    }

}
