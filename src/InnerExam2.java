public class InnerExam2 {
    static class Cal {
        int value = 0;
        public void plus() {
            value++;
        }
    }
    //Cal c = new Cal();
    public static void main(String[] args) {
       // InnerExam2 e = new InnerExam2();
        InnerExam2.Cal e2 = new Cal();
        e2.plus();
        System.out.println(e2.value);

    }
}
