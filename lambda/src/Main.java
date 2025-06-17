import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumProc np = new NumProc();
        np.printHuman((a, b) -> {
            System.out.printf("{%s} 님의 나이는 {%d} 입니다.\n", a, b);
        }, "홍길동", 30);
        np.printCar("그랜저", 7, (m, n) -> {
            System.out.printf("자동자 {%s} 의 년식은 {%d} 입니다.\n", m, n);
        });

        Long res = loopStatic((list) -> {
            long l = 0;
            for(Integer i : list) {
                l += i;
            }
            return l;
        });
        System.out.printf("합은 {%d} 입니다.\n", res);

        Long res2 = loopStatic((list) -> {
            long l = 0;
            for(Integer i : list) {
                l += i;
            }
            return l / list.size();
        });
        System.out.printf("평균은 {%d} 입니다.\n", res2);

        //StreamExample
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product p = new Product(i+1, "상품"+i+1, "회사", (int)(100000 * Math.random()));
            list.add(p);
        }
        list.stream().forEach(p -> System.out.println(p.toString()));

        //MapExample
        int result = 0;
        for (Product p : list) {
            result += p.getPrice();
        }
        System.out.printf("총 가격은 "+result+"입니다.\n");

        //MapExample2
        if (!list.isEmpty()) {
            System.out.printf("총 가격의 평균은 {%d}입니다.\n", result / list.size());
        } else {
            System.out.println("리스트가 비어 있어 평균을 계산할 수 없습니다.");
        }
    }

    private static Long loopStatic(IArrayProc iap) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Long result = iap.process(list);

        return result;
    }

//    public static void StreamExample() {
//        List<Product> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Product p = new Product(i+1, "상품"+i+1, "회사", (int)(100000 * Math.random()));
//            list.add(p);
//        }
//        list.stream().forEach(p -> System.out.println(p.toString()));
//    }
//
//
//    public static void MapExample() {
//        List<Product> list = new ArrayList<>();
//        int result = 0;
//        for (Product p : list) {
//            result += p.getPrice();
//        }
//        System.out.printf("총 가격은 "+result+"입니다.\n");
//    }
//
//    public static void MapExample2() {
//        List<Product> list = new ArrayList<>();
//        int result = 0;
//        for (Product p : list) {
//            result += p.getPrice();
//        }
//        if (!list.isEmpty()) {
//            System.out.printf("총 가격의 평균은 {%d}입니다.\n", result / list.size());
//        } else {
//            System.out.println("리스트가 비어 있어 평균을 계산할 수 없습니다.");
//        }
//
//    }
}