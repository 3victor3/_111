package Chapter_fourteen;

import java.util.*;

public class Updatestu1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("01","丽丽");
        map.put("02","花花");
        Set<String> set = map.keySet();
        Iterator<String> ite = set.iterator();
        System.out.println("key集合中的元素:");
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
        Collection<String> coll = map.values();
        ite = coll.iterator();
        System.out.println("value集合中的元素");
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
