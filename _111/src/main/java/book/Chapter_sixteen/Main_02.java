package book.Chapter_sixteen;

import java.lang.reflect.Field;

public class Main_02 {
    public static void main(String[] args) {
        Example_02 example = new Example_02();
        Class exampleC = example.getClass();
        //获得所有成员变量
        Field[] declaredFields = exampleC.getDeclaredFields();
        for (int i=0; i<declaredFields.length; i++){
            Field field = declaredFields[i];//遍历成员变量
            System.out.println("成员变量名字为:");//获取成员变量名字
            Class fieldType = field.getType();//获取成员变量类型
            System.out.println("类型为："+fieldType);
            boolean isTurn = true;
            while (isTurn){//这里设置一个isTurn，如果是不允许访问的private方法，那么直接会抛出异常
                try {
                    isTurn = false;
                    //获取成员变量的值
                    System.out.println("修改前的值为："+field.get(example));
                    //判断是否为Int类型
                    if (fieldType.equals(int.class)){
                        System.out.println("利用setInt()方法修改成员变量的值");
                        field.setInt(example,168);//为int变量赋值
                    }else if (fieldType.equals(float.class)){//判断是否为float类型
                        System.out.println("利用setFloat()方法修改成员变量的值");
                        //为float变量赋值
                        field.setFloat(example,99.9F);
                    }else if (fieldType.equals(boolean.class)){//判断是否为Boolean类型
                        System.out.println("利用setBoolean()方法修改成员变量的值");
                        //为变量设置值
                        field.setBoolean(example,true);
                    }else{
                        System.out.println("利用方法set()修改成员变量的值");
                        //为各种类型的成员变量赋值
                        field.set(example,"MWQ");
                    }
                    //获取成员变量的值
                    System.out.println("修改后的值为："+field.get(example));
                }catch (Exception e){
                    System.out.println("在设置成员变量值时抛出异常，"+"下面执行setAccessbile()方法！");
                    field.setAccessible(true);
                    isTurn = true;
                }
            }
            System.out.println();
        }
    }
}
