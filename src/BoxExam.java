public class BoxExam {
    public static void main(String[] args) {
//        Box box = new Box();
//        box.setObj(new Object()); //객체 새로 생성해서 넣기
//        Object obj = box.getObj();
//
//        box.setObj("hello");
//        String str = (String)box.getObj(); // 형변환
//        System.out.println(str);
//
//        box.setObj(1);
//        int i = (int)box.getObj();
//        System.out.println(i);

        /**
         * Generic 지정 후 -> 형변환을 거치지 않아도 됨
         */

        Box<Object> box = new Box<>();
        box.setObj(new Object());
        Object obj = box.getObj();

        Box<String> box2 = new Box<>();
        box2.setObj("asdf");
        String str = box2.getObj();

        Box<Integer> box3 = new Box<Integer>();
        box3.setObj(3);
        int i = box3.getObj();



    }
}
