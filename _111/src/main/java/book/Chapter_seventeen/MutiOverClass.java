package book.Chapter_seventeen;

import java.util.HashMap;
import java.util.Map;

public class MutiOverClass<K,V> {
    public Map<K,V> m = new HashMap<K, V>();//
    //设置put方法将对应的键名和键值存入集合对象中
    public void put(K k, V v){
        m.put(k,v);
    }
    public V get(K k){
        return m.get(k);//根据键名获取值
    }

    public static void main(String[] args) {
        //实例化泛型类对象
        MutiOverClass<Integer, String> mu = new MutiOverClass<Integer, String>();
        for (int i=0; i<5; i++){
            //根据集合的长度将键名和和具体值放入集合中
            mu.put(i, "I am the member"+i);
        }
        for (int i=0; i<mu.m.size(); i++){
            //调用get()方法获取集合中的值
            System.out.println(mu.get(i));
        }
    }
}
