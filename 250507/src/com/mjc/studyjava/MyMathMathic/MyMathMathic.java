
//5월7일 문제 (계산기 클래스를 만들어 본다.)

//com.mjc.studyjava.MyMathMathic 클래스 생성
package com.mjc.studyjava.MyMathMathic;

import java.util.Scanner;

public class MyMathMathic {
    public static void main(String[] args) {
        System.out.printf("두 수를 입력하세요 >> "); //대문자클래스명.out.멤버메소드
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.printf("두 문자열을 입력하세요 >> ");
        Scanner s1 = new Scanner(System.in);
        String a1 = s1.next();
        String b1 = s1.next();

        MyMathMathic mathic = new MyMathMathic();
        System.out.printf("\n두 수를 더한 결과 : %d\n", mathic.add(a, b));
        System.out.printf("두 수를 뺀 결과 : %d\n", mathic.sub(a, b));
        System.out.printf("두 수를 곱한 결과 : %d\n", mathic.mul(a, b));
        System.out.printf("두 수를 나눈 몫 결과 : %d\n", mathic.divM(a, b));
        System.out.printf("두 수를 나눈 몫 결과 : %d\n", mathic.divN(a, b));

        System.out.printf("\n두 수가 같으면 true 리턴, 아니면 false 리턴 : "+ mathic.same(a, b)+"\n");
        System.out.printf("두 문자열이 같으면 true 리턴, 아니면 false 리턴 : "+ mathic.same(a1, b1)+"\n");
        System.out.printf("두 수가 다르면 true 리턴, 아니면 false 리턴 : "+ mathic.notsame(a, b)+"\n");
        System.out.printf("a가 b보다 크면 true 리턴, 아니면 false 리턴 : "+ mathic.big(a, b)+"\n");
        System.out.printf("a가 b보다 작으면 true 리턴, 아니면 false 리턴 : "+ mathic.small(a, b)+"\n");

        System.out.printf("\na를 b 만큼 왼쪽 시프트 결과 값을 리턴 : %d\n", mathic.shiftLeft(a, (byte)b));
        System.out.printf("a를 b 만큼 오른쪽 시프트(부호유지) 결과 값을 리턴 : %d\n", mathic.shiftRight(a, (byte)b));
        System.out.printf("a를 b 만큼 오른쪽 시프트(부호를0으로) 결과 값을 리턴 : %d\n", mathic.shiftRight0(a, (byte)b));
        System.out.printf("a를 b만큼 제곱한 결과 값을 리턴, *= 이용하여 코딩하세요 : %dL\n", mathic.square(a, (byte)b));
        System.out.printf("a의 절대값을 리턴 : %d\n", mathic.absolute(a));
        System.out.printf("a 값을 16진수 문자열로 리턴 : "+ mathic.toHex(a)+"\n");
        System.out.printf("a 값을 2진수 문자열로 리턴 : "+ mathic.toBin(a)+"\n");
        System.out.printf("a 값을 8진수 문자열로 리턴 : "+ mathic.toOct(a)+"\n");
        System.out.printf("a 값을 10진수 문자열로 리턴 : %d", mathic.toDec(a1));

    }

    //산술연산 하는 멤버메소드 5개 생성
    //int add(int a, int b) : 두수를 더한 결과 리턴
    //int sub(int a, int b) : 두수를 뺀 결과 리턴
    //long mul(int a, int b) : 두수를 곱한 결과 리턴
    //int divM(int a, int b) : 두수를 나눈 몫 결과 리턴
    //int divN(int a, int b) : 두수를 나눈 나머지 결과 리턴
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public long mul(int a, int b) {
        return a * b;
    }

    public int divM(int a, int b) {
        return a / b;
    }

    public int divN(int a, int b) {
        return a % b;
    }

    //비교연산 하는 멤버메소드 4개 생성
    //boolean same(int a, int b) : 두수가 같으면 true 리턴, 아니면 false
    //boolean same(String a, String b) : 두 문자열이 같으면 true 리턴, 아니면 false
    //boolean notsame(int a, int b) : 두수가 다르면 true 리턴, 아니면 false
    //boolean big(int a, int b) : a가 b보다 크면 true 리턴, 아니면 false
    //boolean small(int a, int b) : a가 b보다 작으면 true 리턴, 아니면 false
    public boolean same(int a, int b) {
        if (a == b) {
            return true;
        } else return false;
    }

    public boolean same(String a1, String b1) {
        if (a1.equals(b1)) {
             return true;
        } else return false;
    }

    public boolean notsame(int a, int b) {
        if(a!=b) {
            return true;
        } else return false;
    }

    public boolean big(int a, int b){
        if(a>b){
            return true;
        } else return false;
    }

    public boolean small(int a, int b) {
        if(a<b) {
            return true;
        } else return false;
    }
    //기타연산 하는 멤버메소드
    //int shiftLeft(int a, byte b) : a를 b 만큼 왼쪽 시프트 결과 값을 리턴
    //int shiftRight(int a, byte b) : a를 b 만큼 오른쪽 시프트(부호유지) 결과 값을 리턴
    //int shiftRight0(int a, byte b) : a를 b 만큼 오른쪽 시프트(부호를0으로) 결과 값을 리턴
    //long square(int a, byte b) : a를 b만큼 제곱한 결과 값을 리턴, *= 이용하여 코딩하세요
    //int absolute(int a) : a의 절대값을 리턴
    //String toHex(int a) : a 값을 16진수 문자열로 리턴
    //String toBin(int a) : a 값을 2진수 문자열로 리턴
    //String toOct(int a) : a 값을 8진수 문자열로 리턴
    //int toDec(String a) : a 문자열을 10진수 정수로 리턴
    public int shiftLeft(int a, byte b) {
        return a << b;
    }

    public int shiftRight(int a, byte b) {
        return a >> b;
    }

    public int shiftRight0(int a, byte b) {
        return  a >>> b;
    }

    public long square(int a, byte b) {
        int result = 1;
        for(int i=0; i<b; i++){
            result *= a;
        }
        return result;
    }

    public int absolute(int a) {
        if(a<0) {
            return a *= -1;
        } else return a;
    }

    public String toHex(int a) {
        String hex = Integer.toHexString(a); ;
        return hex;
    }

    public String toBin(int a) {
        String bin = Integer.toBinaryString(a);
        return bin;
    }

    public String toOct(int a) {
        String oct = Integer.toOctalString(a);
        return oct;
    }

    public int toDec(String a1) {
        int decimal = Integer.parseInt(a1);
        return decimal;
    }
}








