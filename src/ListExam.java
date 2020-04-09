import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("\nhello");
        list.add("hello");
        list.add("world");

        System.out.print(list.size());
        for(int i=0;i<list.size();i++) {
            String s = list.get(i);
            System.out.print(s);
        }
    }
}
