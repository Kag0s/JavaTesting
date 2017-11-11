package com.company;


public class Palindrome {
    StringBuilder sb = new StringBuilder();

    public static boolean palindrome(StringBuilder a) {
        StringBuilder reverse = new StringBuilder();
        reverse.append(a);
        reverse.append(reverse.reverse());
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != reverse.charAt(i)){return false;}
        }
        return true;
    }
}
