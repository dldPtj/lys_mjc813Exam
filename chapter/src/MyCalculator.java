public class MyCalculator<N> { //public class MyCalculator<N extends Number> {
    public static void main(String[] args) {
        MyCalculator<Number> n = new MyCalculator<>(); //
        Number num1 = n.add(20, 30);
        Number num2 = n.add(20.0, 30.5);
        Number num3 = n.sub(50, 5);
        Number num4 = n.sub(10.5, 5.5);
        System.out.printf(String.valueOf(num1), num2, num3, num4);
    }
    public N add(Object a, Object b) {
        return a + b;
    }
    public N sub(Object a, Object b) {
        return a - b;
    }
}
