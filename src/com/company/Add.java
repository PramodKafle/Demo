package com.company;

public class Add {
    public static int add(int x,int y){
        return x+y;}
        public static int sub(int x,int y){
            return x-y;
    }
    public static int mul(int x,int y){
        return x*y;
    }
    public static double div(double x,double y) {
        return x / y;
    }
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(sub(3,2));
        System.out.println(mul(3,2));
        System.out.println(div(3,2));
    }

}





