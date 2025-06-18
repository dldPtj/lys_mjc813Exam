package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        //Boxing
        Integer obj = 100;
        System.out.println("value: "+obj.intValue());

        //Unboxing
        int value = obj;
        System.out.println("value: "+value);

        //연산 시 Unboxing
        int result = obj + 100;
        System.out.println("result: "+result); //System.out.println("result: "+(obj+100)); <<괄호 안치면 문자열로 인식해서 100100 출력됨
    }
}
