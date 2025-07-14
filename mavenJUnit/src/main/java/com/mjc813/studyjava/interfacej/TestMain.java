package com.mjc813.studyjava.interfacej;

public class TestMain extends Thread implements ITestMain {
    @Override
    public void run() {
        this.myRun();
        this.myRun2(this);
    }

    private void myRun() {
        for (int i = 0; i < 100000; i++) {
            System.out.printf("myRun: %d\n", i);
        }
    }

    private void myRun2(ITestMain im) {
        for (int i = 0; i < 100000; i++) {
            im.print(String.format("myRun2: %d\n", i));
        }
    }
    @Override
    public void print(String n) {
        System.out.println(n);
    }
    public static void main(String[] args) {
        TestMain t = new TestMain();
        t.start();
    }
}
