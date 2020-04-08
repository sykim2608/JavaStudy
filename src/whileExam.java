import java.util.Scanner;

public class whileExam {
    public static void main(String[] args) {
//        int i = 0;
//        while(i++<10) {
//            System.out.println(i);
////            i++;
//        }

        /**
         * while 문
         */
//        int total = 0;
//        int i = 1;
//        while(i<=100) {
//            total = total + i;
//            i++;
//        }
//        System.out.println(total);

        /**
         * do while 문
         */
        int value = 0;
        Scanner scan = new Scanner(System.in); // system.in: keyboard 입력 값!!

        do {
            value = scan.nextInt();
            System.out.println("입력값: "+value);
        }while(value != 10);

        System.out.println("반복문 종료");

    }
}
