package com.stackroute;

public class ReplaceDWithFAndLWithT {

    public String replaceDWithF(String str){

        return str.replaceAll("d", "f");

    }

    public String replaceLWithT(String str){

        return str.replaceAll("l","t");

    }

    public static void main(String[] args) {

        ReplaceDWithFAndLWithT replaceDWithFAndLWithT = new ReplaceDWithFAndLWithT();

        System.out.println(replaceDWithFAndLWithT.replaceLWithT((replaceDWithFAndLWithT.replaceDWithF("daily dry"))));

    }

}
