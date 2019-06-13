package book.Chapter_seventeen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LimitClass<T extends List> {//限制泛型的类型

    public static void main(String[] args) {
        //实例化已经实现List接口的类
        LimitClass<ArrayList> l1 = new LimitClass<ArrayList>();
        LimitClass<LinkedList> l2 = new LimitClass<LinkedList>();
        //错误的语法，hashmap没有实现list接口
        //LimitClass<HashMap> l3 = new LimitClass<HashMap>();
    }
}
