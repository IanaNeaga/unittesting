package com.sda.unittest;

public class Calculator {

    private int x=1;
    private int y=1;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int aduna(){
        return x+y;
    }

    public int aduna(int a, int b){
        return a+b;
    }

    public int imparte(int a,int b){
        if(b==0){
            throw new ArithmeticException("Division by zero");
        }else{
            return a/b;
        }
    }

}
