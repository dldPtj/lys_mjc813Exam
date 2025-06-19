package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<String> list = new ArrayList<String>();
        list.add("홍길동");
        list.add("김철수");
        list.add("이영희");
        list.add("이소희");

        Stream<String> stream = list.stream();
        stream.forEach(namename -> {
            System.out.println(namename+": "+Thread.currentThread().getName());
        });
    }
}
