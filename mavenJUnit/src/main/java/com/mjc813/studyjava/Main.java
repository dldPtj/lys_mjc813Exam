package com.mjc813.studyjava;

public class Main {
    public static void main(String[] args) {
        Computer[] coms = new Computer[5];
        for(int i = 0; i < coms.length; i++) {
            coms[i] = new Computer("com"+(i+1), ECpu.Gen9_i5, ERam.RAM_8GB, EStorage.SSD_500GB, EGraphic.Intel_A770);
        }
        for(Computer com : coms) {
            com.booting();
            com.print();
            com.powerOff();
        }
    }
}
