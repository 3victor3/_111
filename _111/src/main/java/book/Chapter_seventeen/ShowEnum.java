package book.Chapter_seventeen;

import static java.lang.System.out;

public class ShowEnum {
    enum Constants2{
        constant_a,constant_b
    }

    //遍历枚举类型
    public static void main(String[] args) {
        for (int i=0; i<Constants2.values().length; i++){
            //输出成员变量
            out.println("枚举类型成员变量："+Constants2.values()[i]);
        }
    }
}
