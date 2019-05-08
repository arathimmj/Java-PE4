package com.stackroute;

public class ReplaceDWithFAndLWithT {

//    replace d with f
    public String replaceDWithF(String str){

        return str.replaceAll("d", "f");

    }

//    replace l with t
    public String replaceLWithT(String str){

        return str.replaceAll("l","t");

    }

    public static void main(String[] args) {

        ReplaceDWithFAndLWithT replaceDWithFAndLWithT = new ReplaceDWithFAndLWithT();

//        print results
        System.out.println(replaceDWithFAndLWithT.replaceLWithT((replaceDWithFAndLWithT.replaceDWithF("daily dry"))));

    }

}
