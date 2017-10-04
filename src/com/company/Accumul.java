package com.company;

public class Accumul {

    public static String accum(String s) {
        String ans = "";
        for(int i = 0;i<s.length();i++){
            ans = ans +(Character.toUpperCase(s.charAt(i)));
            System.out.print(ans);
            for(int j = 0;j<i;j++){
                ans= ans + (Character.toLowerCase(s.charAt(i)));
            }
            if (i+1<s.length()) {
                ans = ans + ('-');
            }
        }
        return ans;
    }
}
