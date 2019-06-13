package book.Chapter_seventeen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class AnyClass {
    public static void main(String[] args) {
        //定义arraylist容器
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);//
        for (int i=0; i<a.size(); i++){
            //
            System.out.println("获取容器中的值"+a.get(i));
        }
        Map<Integer, String> m = new HashMap<Integer, String>();
        for (int i=0; i<5; i++){
            m.put(i,"member"+i);//
        }
        for (int i=0; i<m.size(); i++){
            System.out.println("get the value of the hashmap:"+m.get(i));
        }
        //
        Vector<String> v = new Vector<String>();
        for (int i=0; i<5; i++){
            v.addElement("member"+i);//
        }
        for (int i=0; i<v.size(); i++){
            System.out.println("get the value of vector:"+v.get(i));
        }

    }
}
