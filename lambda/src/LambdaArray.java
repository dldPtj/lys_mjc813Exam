import java.util.ArrayList;
import java.util.List;

public abstract class LambdaArray implements IArrayProc {
    public static void main(String[] args) {

    }
    List<Integer> list = new ArrayList<>();
    void sum () {
        Long sum = 0L;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.printf("합은 {%d} 입니다.", sum);
    }
    int result = 0;
    void avg () {
        Long avg = 0L;
        result = list.stream().reduce(0, (x, y) -> x + y);
        System.out.printf("평균은 {%d} 입니다.", avg);
    }
}
