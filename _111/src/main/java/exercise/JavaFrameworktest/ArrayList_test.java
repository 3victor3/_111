package exercise.JavaFrameworktest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("hahaha");

        //foreach 遍历 List
        for (String str : list){
            System.out.println(str);
        }

        //链表变为数组相关内容进行遍历
        String[] strAaary = new String[list.size()];
        list.toArray(strAaary);
        for (int i=0;i<strAaary.length;i++){
            System.out.println(strAaary[i]);
        }

        //迭代器进行遍历
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
