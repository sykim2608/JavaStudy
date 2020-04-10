public class ThreadExam2 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("*");
        MyThread2 t2 = new MyThread2("-");

        //t1.run(); //thread를 상속받지 않으면, start()없이 run()해도 됨
        Thread thread1 = new Thread(String.valueOf(t1));
        Thread thread2 = new Thread(String.valueOf(t2));

        thread1.start();
        thread2.start();
    }
}
