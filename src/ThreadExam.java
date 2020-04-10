public class ThreadExam {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1("hello");
        MyThread1 thread2 = new MyThread1("-");

        thread.start(); //thread를 상속받은 경우 start를 해주어야 한다 !
        thread2.start();

        System.out.println("main thread end");

     //   thread.run();
     //   thread2.run();

    }
}
