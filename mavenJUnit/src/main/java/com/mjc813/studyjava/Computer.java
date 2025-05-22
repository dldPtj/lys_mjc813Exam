package com.mjc813.studyjava;

public class Computer {
    private String name; // 클래스 안에 멤버변수(필드) -- 힙 메모리에 저장됨
    private ECpu cpu;
    private ERam ram;
    private EStorage storage;
    private EGraphic graphic;

    public Computer(String name, ECpu cpu, ERam ram, EStorage stor, EGraphic graphic) {

        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = stor;
        this.graphic = graphic;
    }

    public void booting(){
        System.out.printf("%s가 켜졌습니다.\n", this.name);
    }
    public void powerOff() {
        System.out.printf("%s가 꺼집니다.\n", this.name);
    }

    public void print() {
        System.out.printf("%s", this.name+"\n");
        System.out.printf("CPU: "+this.cpu+"\n");
        System.out.printf("RAM: "+this.ram+"\n");
        System.out.printf("Storage: "+this.storage+"\n");
        System.out.printf("Graphic: "+this.graphic+"\n");
    }
}