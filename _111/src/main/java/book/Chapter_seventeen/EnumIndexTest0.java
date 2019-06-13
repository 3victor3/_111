package book.Chapter_seventeen;

public class EnumIndexTest0 {
    enum Constants2{//将常量存入枚举类型
        constant_a,constant_b,constant_c
    }

    public static void main(String[] args) {
        for (int i=0; i<Constants2.values().length; i++){
            //在循环中获取枚举类型的索引位置
            System.out.println(Constants2.values()[i]+"在枚举类型中的索引位置"+Constants2.values()[i].ordinal());
        }
    }
}
