public class DaemonThread implements Runnable {

    @Override
    public void run() {
        System.out.println("thread 실행");
        while(true) {
            try{
                Thread.sleep(500);
            }
            catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread th = new Thread(new DaemonThread()); //DaemonThread를 실행하기 위한 Thread 생성
        th.setDaemon(true); //daemon thread 설정
        th.start(); //thread 실행

        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main thread 종료 ");

    }
}
