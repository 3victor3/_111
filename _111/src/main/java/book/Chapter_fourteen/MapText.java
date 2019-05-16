//通过HashMap类实例化Map集合，并且遍历该集合，创建TreeMap实例顺序输出


//HASHMAP是基于哈希表的Map接口实现，此实现提供所有可选的映射操作，并且允许使用null值和null键，但是必须保证键的唯一性。
// HashMap通过哈希表兑取内部的映射关系进行快速查找。此类不保证映射的顺序，特别是不保证该顺序恒久不变。


//TreeMap不仅实现了Map接口，还实现了java.util.StoredMap接口。因此集合中的映射关系具有一定的顺序。
// 在crud操作的时候性能稍差。因为排序不允许key值为null


package book.Chapter_fourteen;

import book.Chapter_fourteen.Emp;

import java.util.*;

public class MapText {//创建类maptext

    public static void main(String[] args) {//主方法
        Map<String, String> map = new HashMap<String, String>();//hashmap（）实现的map对象

        Emp emp = new Emp("351", "张三");//创建emp对象
        Emp emp2 = new Emp("512", "李四");
        Emp emp3 = new Emp("853", "王一");
        Emp emp4 = new Emp("125", "赵六");
        Emp emp5 = new Emp("341", "黄芪");

        map.put(emp5.getId(), emp5.getName());
        map.put(emp2.getId(), emp2.getName());
        map.put(emp4.getId(), emp4.getName());
        map.put(emp.getId(), emp.getName());//对象添加到集合中
        map.put(emp3.getId(), emp3.getName());

        Set<String> set = map.keySet();//获取对象中的key集合

        Iterator<String> ite = set.iterator();

//        Iterator<String> iteKey = set.iterator();

//        Collection<String> coll = map.values();//获取values的集合

//        Iterator<String> iteColl = coll.iterator();

        System.out.println("Hashmap类实现的map合集，无序：");
        while (ite.hasNext()) {
//            String str1 = iteKey.next();
//            String str2 = iteColl.next();

//            System.out.println(str1+" "+str2);
            String string = (String) ite.next();
            String name = (String) map.get(string);
            System.out.println(string + " " + name);
        }

        TreeMap<String, String> treeMap = new TreeMap<String, String>();//创建TreeMap集合对象
        treeMap.putAll(map);//向集合添加对象
        Iterator<String> iter = treeMap.keySet().iterator();//这一步省略了先生成一个set再实例化迭代器
        System.out.println("TreeMap类实现的map集合，键对象升序：");
        while (iter.hasNext()) {
            String str = (String) iter.next();//获取所有key对象
            String name = (String) treeMap.get(str);//获取所有的value值
            System.out.println(str + " " + name);
        }
    }
}
