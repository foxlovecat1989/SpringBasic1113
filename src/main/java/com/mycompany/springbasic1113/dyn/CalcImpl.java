package com.mycompany.springbasic1113.dyn;

public class CalcImpl implements Calc {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
    
}
