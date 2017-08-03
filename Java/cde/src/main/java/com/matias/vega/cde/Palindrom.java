package com.matias.vega.cde;


/**
 * Write a program which takes input as string and check it is palindrom or not.
 * If the string and the reverse of string are same then we say string is palindrom.
 * Example : 1.If string is "level" then the output should be: palindrome 2.
 * If string is "helloworld" then the output should be: not a palindrome
 */
public class Palindrom {

    public static boolean isPalindrom(String word) {

        if( word == null ) {
            return false;
        }

        String dorw = "";

        for(char c : word.toCharArray()){
            dorw = c + dorw;
        }

        return dorw.equals( word );

    }
}
