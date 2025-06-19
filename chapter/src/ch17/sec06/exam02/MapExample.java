package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };

        IntStream intStream = Arrays.stream(intArray);
        intStream
                .asDoubleStream()
                .forEach(i -> System.out.println(i));
        System.out.println();
        //이미 Double형으로 바뀌어서 다시 정의해주고 boxed 해야함

        intStream = Arrays.stream(intArray);
        intStream
                .boxed()
                .forEach(i -> System.out.println(i.intValue()));
    }
}
