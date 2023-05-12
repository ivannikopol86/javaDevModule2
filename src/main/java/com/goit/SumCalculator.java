package com.goit;

public class SumCalculator {
    public int sum(int n) {
        if(n<=0){
            throw new IllegalArgumentException("Не може бути нуль або меньше нуля");
        }
        int result=0;
        for (int i = 0; i<=n ; i++){
            result=result+i;
        }
        return result;
    }
}
