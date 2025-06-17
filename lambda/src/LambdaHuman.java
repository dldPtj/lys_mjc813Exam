public abstract class LambdaHuman implements INumberProc {
    public static void main(String[] args) {
        printHuman((str, age) -> {
            System.out.println(str+"님의 나이는 "+age+"입니다.");
        });
        printCar((str, age) -> {
            System.out.println("자동차"+str+"의 년식은 "+age+"입니다.");
        });

    }
    private static void printHuman(INumberProc inp) {
        //데이터
        inp.process("홍길동", 20);
    }
    private static void printCar(INumberProc inp) {
        inp.process("모닝", 5);
    }

}
