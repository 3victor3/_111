package book.Chapter_seventeen;

public class OverClass<T> {//定义泛型类
    private T over;//定义泛型成员变量
    public T getOver(){//设置get()方法
        return over;
    }
    public void setOver(T over){//设置set()方法
        this.over = over;
    }

    public static void main(String[] args) {
        //实例化一个boolean对象
        OverClass<Boolean> over1 = new OverClass<Boolean>();
        //实例化一个float对象
        OverClass<Float> over2 = new OverClass<Float>();
        over1.setOver(true);//不需要进行类型转换
        over2.setOver(12.3f);
        Boolean b = over1.getOver();//不需要进行类型转换
        Float f = over2.getOver();
        System.out.println(b);
        System.out.println(f);
    }
}
