import java.time.LocalDate;
import java.time.LocalDateTime;


public class TimeExam {
    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);

        LocalDate ld1 = LocalDate.of(2012,12,12);

        String str = timePoint.getMonth().toString();
        System.out.println(str);
    }
}
