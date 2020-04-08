public class ExceptionExam {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = i/j;
            System.out.println(k);
        } catch (ArithmeticException e) {
         //   e.printStackTrace();
            System.out.println(e.toString());
        }
        finally {
            System.out.println("finally 실행");
        }



    }
}
