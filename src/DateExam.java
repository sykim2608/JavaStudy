import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.print(date.toString());

        SimpleDateFormat ft = new SimpleDateFormat("yyyy_MM_dd 'at' hh:mm:ss a zzz");
        // M:월, 문자 넣을 때는 '', a: 오전오후 표기, zzz:time zone
        System.out.print(ft.format(date));

        long ln = System.currentTimeMillis();
        System.out.print(ln);
    }
}
