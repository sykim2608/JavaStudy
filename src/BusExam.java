public class BusExam {
    public static void main(String[] args) {
        Bus b1 = new Bus();
//        b1.name = "123";
//        b1.Run();
        b1.Run1();

        Car c1 = new Bus();
        c1.Run1();
        c1.name = "asdfasdf";

        Bus b2 = (Bus) c1;
        b2.pang();
        System.out.println(b2.name);
        b2.Run();

    }
}
