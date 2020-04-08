public class CarExam {
    public static void main(String[] args) {
        /**
         * car 생성자 1
         */
//        Car c1 = new Car();
//        Car c2 = new Car();
//
//
//        c1.name = "hello";
//        c1.number = 1;
//
//
//
//
//
//        /**
//         * String
//         */
//        int i=4;
//        String str1 = new String("hello"); // 참조형 스트링
//        String str2 = "hello";
//        String str3 = "hello";
//        String str4 = new String("hello");
//
//        if(str2 == str3) System.out.println("same");
//        if(str1 == str4) System.out.println("same2");
//
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str1.substring(2));
//        System.out.println(str1.compareTo("hello"));
//        System.out.println(str1.equals(str2));
//        //System.out.println(str1.split("hel"));
//        System.out.println(c1.name.equals(str1));

        /**
         * 생성자 2
         */
        Car car1 = new Car("initializing");
        System.out.println(car1.name);
        Car car2 = new Car();
        System.out.println(car2.name);



    }
}
