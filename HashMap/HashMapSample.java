import java.util.*;

public class HashMapSample {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("a", 10);
        hashMap.put("b", 20);

        System.out.println(hashMap);
        System.out.println(hashMap.get("b"));
        
        hashMap.remove("a");
        System.out.println(hashMap.containsValue(20));
        System.out.println(hashMap.containsValue(10));

    }

}
