package ch17.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList( //출력이나 계산하는 용도(Arrays.asList로 사용해야함)
                new Student("홍길동", 10),
                new Student("정성찬",25),
                new Student("이소희", 23)
        );

        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println("평균 : " + avg);
    }
}
