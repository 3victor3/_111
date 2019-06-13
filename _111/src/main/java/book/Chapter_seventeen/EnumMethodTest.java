package book.Chapter_seventeen;

public class EnumMethodTest {
    enum Constants2{//将常量放入枚举类型中
        Constants_A,Constants_B
    }

    public static void compare(Constants2 constants2){//
        //
        for (int i=0; i<Constants2.values().length; i++){
            //
            System.out.println(constants2+"与"+Constants2.values()[i]+"的比较结果为："+constants2.compareTo(Constants2.values()[i]));
        }
    }
    //
    public static void main(String[] args) {
        //Exception in thread "main" java.lang.IllegalArgumentException: No enum constant book.Chapter_seventeen.EnumMethodTest.Constants2.Constants_c,如果输入Constants_c
        compare(Constants2.valueOf("Constants_A"));
    }
}
