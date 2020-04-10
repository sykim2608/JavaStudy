import java.lang.reflect.Method;

public class MyHelloExam {
    public static void main(String[] args) {
        MyHello hello = new MyHello();

        try {
            Method method = hello.getClass().getDeclaredMethod("hello");
            if(method.isAnnotationPresent(Count100.class)) {
                //특정 annotation이 method에 적용되어있는지 (true/false)
                for(int i=0;i<100;i++) {
                    hello.hello();
                }
                            }
            else {
                hello.hello();

            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
