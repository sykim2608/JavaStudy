public class ThreadA {
    public static void main(String[] args) {
        ThreadB tb = new ThreadB();
        tb.start();

        synchronized (tb) {
            try{
                System.out.println("b가 완료될때까지 기다림");
                tb.wait();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("total: "+tb.total);
        }
    //    System.out.println("total: "+tb.total);

    }
}
