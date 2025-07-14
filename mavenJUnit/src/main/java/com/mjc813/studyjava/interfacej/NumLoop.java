package com.mjc813.studyjava.interfacej;

import java.util.Scanner;

public class NumLoop {
    private int sum;
    public static void main(String[] args) {
        NumLoop numLoop = new NumLoop();
        System.out.print("매개변수 값의 배수인 값을 출력하는 기능을 만들 예정이다. 원하는 매개변수 값을 입력하라. >> ");
        Scanner scan  = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1; num*i<=100000; i++) {
            System.out.printf("%d\n", num*i);
        }
    }
}
