package exercise.JavaFrameworktest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //普遍使用，二次取值
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        for (String key : map.keySet()){
            System.out.println("key="+ key + " and values= " + map.get(key));
        }

        //
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String,String>> ite = map.entrySet().iterator();
        while (ite.hasNext()){
            Map.Entry<String,String> entry = ite.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //大容量时候使用
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }


    }
}
