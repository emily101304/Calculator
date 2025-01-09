package com.example;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        System.out.println("계산기 시작!");
        Scanner sc = new Scanner(System.in);
        Calculator cal1 = new Calculator();
        int num1, num2;

        while(true) {
            do {
                System.out.println("첫 번째 숫자를 입력하세요!");
                num1 = sc.nextInt();
                if (num1 < 0) {
                    System.out.println("양의 정수를 입력하세요!");
                    }
                } while (num1 < 0);

            do {
                System.out.println("두 번째 숫자를 입력하세요!");
                num2 = sc.nextInt();
                if (num2 < 0) {
                    System.out.println("양의 정수를 입력하세요!");
                    }
                } while (num2 < 0);

            System.out.println("+, -, *, / : ");
            char strChar;
            int result;
            strChar = sc.next().charAt(0);


            result = cal1.calculator(num1, num2,strChar);
            cal1.saveResult(result);

            System.out.println("결과 : " + result);

            //값을 수정할 부분
            System.out.println("수정하시겠습니까?");
            String replace = sc.next();
            if (replace.equals("yes")) {
                System.out.println("몇번째 값을 수정하시겠습니까?");
                int index = sc.nextInt();
                System.out.println("수정할 값을 입력해주세요!");
                int number = sc.nextInt();
                cal1.setResult(index,number);
            }

                //먼저 저장된 값을 삭제할 부분
            System.out.println("가장 최근 값을 삭제하시겠습니까?");
            String delStr = sc.next();
            if (delStr.equals("yes")) {
                cal1.delResult();
                }

            //결과 값 가져올 부분
            System.out.println(cal1.getResults());

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String quitStr = sc.next();

            if(quitStr.equals("exit")) {
                System.out.println("종료!");
                break;
                }
            }
        }
    }


