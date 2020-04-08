public class InnerExam3 {
    public void exec() {
        class Cal{
            int value = 0;
            public void plus() {
                value++;
            }
        }
        Cal cal = new Cal();
        cal.plus();
    }
    public static void main(String[] args) {
        InnerExam3 e3 = new InnerExam3();
        e3.exec();


    }
}
