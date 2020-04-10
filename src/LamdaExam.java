public class LamdaExam {
    public static void main(String[] args) {
        //thread 생성자 안에 넣은 run이 실행이 됨 -> run method를 가진 runnable 객체를 전달
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    System.out.println("hello");
                }
            }
        }).start();

       //자바는 메소드를 전달할 수 없기 때문에, 매번 객체를 생성해서 매개변수로 전달해야한다.
        //-> 람다 표현식으로 해결 가능
        /**
         * 람다식(익명메소드)
         */
        new Thread(() -> {
                for(int i=0;i<10;i++) {
                    System.out.println("hello");
                }

        }).start();

    }
}
