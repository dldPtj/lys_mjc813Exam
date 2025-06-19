package ch17.sec03;

import lombok.Getter;


@Getter
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

