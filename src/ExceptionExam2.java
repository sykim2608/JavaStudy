public class ExceptionExam2 {
    public static void main(String[] args) {

        try {
            int k = divide(2,0);
            System.out.println(k);
        }
        catch(ArithmeticException e) {
            System.out.println("asdf");
            System.out.println(e.toString());

        }


    }

    public static int divide(int i,int j) throws ArithmeticException{
        System.out.println("divide call");
        int k = i/j;
        System.out.println(("i/j 실행"));
        return k;
    }
}
