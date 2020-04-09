import java.util.*;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001","kim");
        map.put("002","lee");
        map.put("003","park");

       // map.put("001","ki"); //같은 key의 경우, 최근 value를 저장함
        System.out.print(map.get("001")); //key를 이용하여 값을 꺼낼 수 있음
        System.out.print(map.size()+"\n");
       // System.out.print(map.keySet());

        Set<String> key = map.keySet();

        Iterator<String> str = key.iterator();
       // String value = map.get(str);

        while(str.hasNext()) {
            String key2 = str.next();
            String value = map.get(key2);

            System.out.println(key2);
            System.out.print(value);
        }
      //  System.out.println(str.next());


    }
}
