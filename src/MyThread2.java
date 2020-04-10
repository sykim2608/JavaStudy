public class MyThread2 {
    String str;

    public MyThread2(String str) {
        this.str = str;
    }
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println(str);
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
