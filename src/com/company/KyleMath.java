package com.company;


public class KyleMath {

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }else {
            return (a * pow(a, b - 1));
        }
    }

    public static int fib(int a){
        if (a == 0){
            return 0;
        }else if (a == 1) {
            return 1;
        }else {
            return fib(a-1) + fib(a-2);
        }
    }

    public static int fact(int  a){
        if(a ==0){
            return 1;
        }else{
            return (a * fact(a-1));
        }
    }
}