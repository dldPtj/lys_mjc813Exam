package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = { 1, 2, 3, 4, 5 }; //객체 생성이 아니고 값 할당이므로 new 필요없음

        //잘못 작성한 경우
        Arrays.stream(intArr)
                .filter(num -> num%2 == 0)
                .peek(num -> System.out.println(num)); //최종 처리 없기에 동작 X

        //중간 처리 메소드 peek()을 이용해서 반복 처리
        int total = Arrays.stream(intArr)
                .filter(num -> num%2 == 0)
                .peek(num -> System.out.println(num))
                .sum(); //최종 처리
        System.out.println("총합: "+total+"\n");

        //최종 처리 메소드 forEach()를 이용해서 반복 처리
        Arrays.stream(intArr)
                .filter(num -> num%2 == 0)
                .forEach(num -> System.out.println(num)); //최종 처리이므로 동작
    }
}
