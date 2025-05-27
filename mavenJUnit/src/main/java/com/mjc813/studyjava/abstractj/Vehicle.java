package com.mjc813.studyjava.abstractj;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Vehicle {
    private int wheelCount;

    public Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public abstract void move();
    //Object 클래스를 @Override하면 class이름들이 경로로 나오는게 아니라 진짜 이름으로 나옴
    //Getter, Setter를 사용해서 가능한 일
    public abstract void stop();
}
