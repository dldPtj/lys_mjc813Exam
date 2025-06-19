package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"송은석", "박원빈", "이찬영"};
        Stream<String> strStream = Arrays.stream(strArray); //Stream<사용할 자료형> 스트림이름 = Arrays.stream(자료형 변수이름);
        strStream.forEach(item -> System.out.print(item + ", "));
        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item -> System.out.print(item + ", "));
        System.out.println();
    }
}
