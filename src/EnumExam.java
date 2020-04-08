public class EnumExam {
    public static final String MALE="MALE";
    public static final String FEMALE="FEMAIL";


    public static void main(String[] args) {
        String gender;
        gender = EnumExam.MALE;
        gender = EnumExam.FEMALE;
        gender = "hello";

        Gender gender2;
        gender2 = Gender.MAN;
        System.out.println(gender2);



    }

    enum Gender{
        MAN, WOMAN
    }
}
