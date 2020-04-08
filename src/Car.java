public class Car {
    String name;
    int number;

    public void Run1() {
        System.out.println("Car의 Run 메소드");
    }

    public Car(String name) {
        this.name = name;
    }

    public Car() {
        this("helo");
    }

    public void Run() {
        System.out.println("안녕하세요");
    }

}
