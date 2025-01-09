package com.example2;

import java.util.Scanner;

public class testCal {

    public static void main(String[] args) {

//        Solve sov1 = new Solve();
//        System.out.println(sov1);

        System.out.println("계산기 시작!");
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        testCal t= new testCal();


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
            String result;
            strChar = sc.next().charAt(0);





            //String answer = "결과 : " + result;
            //System.out.println(answer);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String quitStr = sc.next();

            if(quitStr.equals("exit")) {
                System.out.println("종료!");
                break;
            }

        }

    }

    }

