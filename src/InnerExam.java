public class InnerExam {
    class Cal {
        int value = 0;
        public void plus() {
            value++;
        }
    }
    public static void main(String[] args) {
        InnerExam t = new InnerExam();
        InnerExam.Cal cal = t.new Cal();
        cal.plus();
        InnerExam.Cal cal2 = t.new Cal();

        System.out.println(cal.value);
    }
}
