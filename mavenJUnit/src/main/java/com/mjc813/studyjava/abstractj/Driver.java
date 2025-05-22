package com.mjc813.studyjava.abstractj;

public class Driver {
    String name;
    int age;
    Vehicle vehicle;

    public Driver(String name, int age, Vehicle vehicle) {
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
    }

    public void drive(){
        System.out.println("운전수"+this.name+"은"+this.vehicle.wheelCount+"개의 바퀴의 트럭"+Truck.class.getName()+"을 운전한다.");
    }

    void breakk(){
        System.out.println("운전수"+this.name+"은 트럭/자전거"+Bicycle.class.getName()+"을 정지한다.");
    }
}
