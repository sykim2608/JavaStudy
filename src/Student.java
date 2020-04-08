public class Student {
    String name;
    String num;
    int birth;

    int i = 5;
    Integer i2 = new Integer(2); // JAVA5 이전 버전
    Integer i3 = 2; // 오토 박싱 (기본 타입을 자동으로 객체 타입으로 변환)

    int i4 = i3.intValue(); //객체로 감싸진걸 빼내기 (이전 버전)
    int i5 = i3; //오토 언박싱

    StringBuffer sb = new StringBuffer();
    String str = sb.append(i3).append(" ").append(i5).toString();


//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    public static void main(String[] args) {
//
//    }
}
