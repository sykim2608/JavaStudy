public class JoinExam {
    public static void main(String[] args) {
        MyThread3 thread = new MyThread3();

        thread.start();


        System.out.println("start");

        try {
            thread.join(); //thread.join()을 통해서, 해당 스레드가 끝날때까지 그다음 코드를 실행하지 않음
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("stop");

    }
}
