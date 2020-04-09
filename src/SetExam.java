import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        boolean flag = set1.add("Hello");
        System.out.println(flag);
        boolean flag2 = set1.add("kim");
        System.out.println(flag2);
        boolean flag3 = set1.add("Hello");
        System.out.println(flag3);
        System.out.println("size: " + set1.size());

        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()) {
        //    System.out.println(iter.);
            String str = iter.next();
            System.out.println(str);
        }

        Set<Integer> i = new HashSet<>();
        boolean f = i.add(2);
        f = i.add(4);
        f = i.add(2);

        Iterator<Integer> iter2 = i.iterator();
        while(iter2.hasNext()) {
            int k = iter2.next();
            System.out.println(k);
        }




    }
}
