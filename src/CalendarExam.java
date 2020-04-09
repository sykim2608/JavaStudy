import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));

        cal.add(Calendar.DAY_OF_YEAR,100);
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        String str = cal.get(Calendar.YEAR) +"년"+(cal.get(Calendar.MONTH)+1) + "월"+cal.get(Calendar.DAY_OF_MONTH)+"일"; // MONTH의 경우 1을 더해주어야 함
        System.out.println(str);
    }
}
