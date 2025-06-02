//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        /**
//         * Chapter03 확인문제
//         */
//        //3번
//        int pencils = 534;
//        int students = 30;
//
//        int pencilsPerStudent = (pencils / students);
//        System.out.println(pencilsPerStudent);
//
//        int pencilsLeft = (pencils % students);
//        System.out.println(pencilsLeft);
//
//        //4번
//        int value = 356;
//        System.out.println((value / 100) * 100);
//
//        //5번
//        int lengthTop = 5;
//        int lengthBottom = 10;
//        int height = 7;
//        double area1 = (lengthTop + lengthBottom) * height / 2.0;
//        double area2 = (lengthTop + lengthBottom) * height * 1.0 / 2;
//        double area3 = (double) (lengthTop + lengthBottom) * height / 2;
//        double area4 = (double) ((lengthTop + lengthBottom) * height / 2); //X
//
//        System.out.println(area1);
//        System.out.println(area2);
//        System.out.println(area3);
//        System.out.println(area4);
//
//        //6번
//        int x = 10;
//        int y = 5;
//
//        System.out.println((x > 7) && (y <= 5));
//        System.out.println((x % 3 == 2) || (y % 2 != 1));
//
//        //7번
//        double x1 = 5.0;
//        double y1 = 0.0;
//        double z1 = 5 % y1;
//        if (y1 == 0.0) {
//            System.out.println("0.0으로 나눌 수 없습니다.");
//        } else {
//            double result = z1 + 10;
//            System.out.println("결과 : " + result);
//        }
//
//        /**
//         * m
//         * @Chapter04 확인문제
//         */
//        //2번
//        String grade = "B";
//
//        int score1 = 0;
//        switch (grade) {
//            case "A":
//                score1 = 100;
//                break;
//            case "B":
//                int result = 100 - 20;
//                score1 = result;
//                break;
//            default:
//                score1 = 60;
//        }
//        System.out.println(grade);
//
//        switch (grade) {
//            case "A" -> score1 = 100;
//            case "B" -> score1 = 80;
//            default -> score1 = 60;
//        }
//        System.out.println(grade);
//
//        //3번
//        int result = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                result += i;
//            } else continue;
//        }
//        System.out.println(result);
//
//        //4번
//        int num1;
//        int num2;
//        do {
//            num1 = (int)(Math.random() * 6) + 1;
//            num2 = (int)(Math.random() * 6) + 1;
//            System.out.println("(" + num1 + "," + num2 + ")");
//        } while (!(num1 + num2 == 5));
//
//        System.out.println("");
//        //5번
//        for(int xx=1; xx<=10; xx++) {
//            for(int yy=1; yy<=10; yy++){
//                if (4 * xx + 5 * yy == 60) {
//                    System.out.println("("+xx+","+yy+")");
//                } else System.out.print("");
//            }
//        }
//
//        //6번
//        for(int k=0; k<5; k++){
//            for(int l=1; l<=k+1; l++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
        /**
         * Chapter11 예외처리 확인문제
         */
        // 6번
        String[] strArray = { "10", "2a" };
        int value = 0;
        for (int i = 0; i <=2; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과했음");
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음");
            } finally {
                System.out.println(value);
            }
        }
    }
}