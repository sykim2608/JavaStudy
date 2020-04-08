public class ifExam {
    public static void main(String[] args) {
        /**
         * if 문
         */
//        int x= 50;
//        int y = 60;
//
//        if(x < y) {
//            System.out.println("test");
//        }
//
//        if(x == y)
//            System.out.println("x와 y와 같지 않음");
//        else
//            System.out.println(("else"));


        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println((b1 || b3) && b2);

        int score = 99;
        if(score <=100 && score > 70)
            System.out.println(("correct"));
        else
            System.out.println("incorrect");

        System.out.println(b1 ^ b2);


    }
}
