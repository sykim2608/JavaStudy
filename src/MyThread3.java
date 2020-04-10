public class MyThread3 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep((int)Math.random()*500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
