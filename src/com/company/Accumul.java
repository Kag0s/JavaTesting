package com.company;

public class Accumul {

    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            sb.append(Character.toUpperCase(s.charAt(i)));
            for(int j = 0;j<i;j++){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            if (i+1<s.length()) {
                sb.append(('-'));
            }
        }
        return sb.toString();
    }
}
