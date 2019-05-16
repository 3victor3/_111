package book.Chapter_fourteen;

import java.util.Iterator;
import java.util.TreeSet;

public class UpdateStu implements Comparable<Object>{//创建类实现的comparable接口
    String name;
    long id;

    public UpdateStu(String name, long id){//构造方法
        this.id = id;
        this.name = name;
    }

    public int compareTo(Object o){
        UpdateStu upstu = (UpdateStu) o;
        int result = id > upstu.id ? 1 : (id ==upstu.id ? 0 : -1);//id大于stu.id返回1；否则判定如果相等返回0，小于返回-1
        return result;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public static void main(String[] args) {
        UpdateStu stu1 = new UpdateStu("李同学",01011);
        UpdateStu stu2 = new UpdateStu("陈同学",01021);
        UpdateStu stu3 = new UpdateStu("王同学",01051);
        UpdateStu stu4 = new UpdateStu("马同学",01012);
        TreeSet<UpdateStu> tree = new TreeSet<UpdateStu>();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        Iterator<UpdateStu> ite = tree.iterator();
        System.out.println("set集合中的所有元素：");
        while (ite.hasNext()){
            UpdateStu stu = ite.next();
            System.out.println(stu.getId()+" "+stu.getName());
        }
        ite = tree.headSet(stu2).iterator();
        System.out.println("截取stu2之前的内容");
        while (ite.hasNext()){
            UpdateStu stu = ite.next();
            System.out.println(stu.getId()+" "+stu.getName());
        }
        ite = tree.subSet(stu2,stu3).iterator();
        System.out.println("截取中间部分的内容");
        while (ite.hasNext()){
            UpdateStu stu = ite.next();
            System.out.println(stu.getId()+" "+stu.getName());
        }
    }
}
