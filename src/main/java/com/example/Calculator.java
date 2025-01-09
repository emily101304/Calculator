package com.example;

import java.util.ArrayList;


public class Calculator {
    private ArrayList<Integer> results = new ArrayList<>();
    int result;

    public int calculator (int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("분모가 0일땐 나눌 수 없음");
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("알 수 없음");
        }
        return result;
    }
    public void saveResult (int result) {
            results.add(result);
    }
    public void setResult(int index,int number) {
            results.set(index,number);
    }
    public ArrayList<Integer> getResults() {
        return this.results;
    }
    public void delResult() {
        results.remove(0);
    }
}



