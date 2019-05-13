package homework;

import java.util.ArrayList;
import java.util.List;

public class fourteen_one {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int i;
        for (i=0;i<=99;i++){
            list.add(i);
        }
        System.out.println(list.size());//list元素个数
        System.out.println(list.remove(10));//移除第十个元素
        System.out.println(list);//打印list
        System.out.println(list.indexOf(50));//该元素的索引
        System.out.println(list.isEmpty());//列表是否为空
        System.out.println(list.get(10));//获取第十个元素
        System.out.println(list.contains(10));//是否包含元素10
        list.clear();//清除列表所有元素
        System.out.println(list.isEmpty());
    }
}
