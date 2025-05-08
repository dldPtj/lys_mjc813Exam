//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //3번
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = (pencils / students);
        System.out.println(pencilsPerStudent);

        int pencilsLeft = (pencils%students);
        System.out.println(pencilsLeft);

        //4번
        int value = 356;
        System.out.println((value/100)*100);

        //5번
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area1 =(lengthTop+lengthBottom)*height/2.0;
        double area2 =(lengthTop+lengthBottom)*height*1.0/2;
        double area3 =(double)(lengthTop+lengthBottom)*height/2;
        double area4 =(double)((lengthTop+lengthBottom)*height/2); //X

        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
        System.out.println(area4);

        //6번
        int x = 10;
        int y = 5;

        System.out.println((x>7) &&(y<=5));
        System.out.println((x%3 == 2)||(y%2 != 1));

        //7번
        double x1 =5.0;
        double y1 =0.0;
        double z1 =5%y1;
        if(y1 == 0.0){
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z1+10;
            System.out.println("결과 : "+result);
        }
    }
}