public class MyClassExam {
    public static void main(String[] args) {
        MyClass myclass = new MyClass("asdf");
        myclass.method1(3);

        String str = "hello";
        System.out.println(str.concat(" world"));
        str = str.concat(" world");
        System.out.println(str);
        str = str.substring(2,str.length());
        System.out.println(str);

        /**
         * method overloading
         */

    }
}
