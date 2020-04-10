public class MusicBox {
    // synchronized: lock 거는 기능
    public synchronized void playMusicA() {
        for(int i=0;i<10;i++) {
            System.out.println("pop1");
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void playMusicB() {
        for(int i=0;i<10;i++) {
            System.out.println("pop2");
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //synchronized안되면 그냥 무작위로 실행됨
    public void playMusicC() {
        for(int i=0;i<10;i++) {
            synchronized (this) { // 이 블럭만 lock
                System.out.println("pop3");
            }
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
