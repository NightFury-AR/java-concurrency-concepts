package com.nightfury.concurrency.section01;



import java.util.HashMap;
import java.util.Map;

public class Testmain {
    public static void main(String[] args) {
        String[] strArr = {"javablog","javaworld","javabean","javatemp","nodeScript"};
        Map<String,Integer> prefixOccurance = new HashMap<>();

        // javablog
        for (String indexString : strArr) {
            int indexLen = indexString.length();
            int charIndex = 0;
            while (charIndex < indexLen) {
                char indexChar = indexString.charAt(charIndex);
                for (int j = 1; j < strArr.length; j++) {
                    if (strArr[j].startsWith(String.valueOf(charIndex))) { //j.j
                        if (prefixOccurance.get(String.valueOf(indexChar)) == null) {
                            prefixOccurance.put(String.valueOf(indexChar), 1);
                        } else {
                            Integer value = prefixOccurance.get(String.valueOf(indexChar));
                            prefixOccurance.put(String.valueOf(indexChar), value + 1);
                        }
                    }
                }
                charIndex++;
            }
        }
        prefixOccurance.forEach((key, value) -> System.out.println("key => " + key + " value => " + value));
    }
}
