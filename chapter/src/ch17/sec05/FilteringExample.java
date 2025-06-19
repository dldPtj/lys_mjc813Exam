package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<String> list = new ArrayList<String>();
        list.add("정성찬");
        list.add("정성찬");
        list.add("이찬영");
        list.add("박원빈");
        list.add("정해인");

        //중복 요소 제거
        list.stream()
                .distinct()
                .forEach(name -> System.out.println(name));
        System.out.println();

        //정으로 시작하는 요소만 필터링
        list.stream()
                .filter(name -> name.startsWith("정"))
                .forEach(name -> System.out.println(name));
        System.out.println();

        //중복 요소를 먼저 제거하고, 정으로 시작하는 요소만 필터링
        //distinct하고 filter startWith 하면 됨
    }
}
