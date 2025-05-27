package com.mjc813.studyjava.abstractj;

public class VehicleMain {
    public static void main(String[] args) {
        Truck truck = new Truck("용달이", 20, 4);
        Bicycle bicycle = new Bicycle("따릉이", 2);
        Driver driver01 = new Driver("김철수", 30, null);
        driver01.drive();
        driver01.breakk();

        Driver driver02 = new Driver("홍길동", 54, null);
        driver02.drive();
        driver02.breakk();
    }
}
