package com.stackroute;

public class CheckIfPresent {

    public boolean checkIfSubstring(String string, String str){

        return string.contains(str);

    }

    public static void main(String[] args) {

        CheckIfPresent checkIfPresent = new CheckIfPresent();

        if (checkIfPresent.checkIfSubstring("This is Harry.", "Harry"))
            System.out.println("Present");
        else
            System.out.println("Absent");

    }

}
