package book.Chapter_seventeen;

//声明数组类型的泛型

public class ArrayClass<T> {
    private T[] array;//定义泛型数值
    public void SetT(T[] array){//设置set方法
        this.array = array;
    }
    public T[] getT(){
        return array;//获取成员数组
    }

    public static void main(String[] args) {
        ArrayClass<String> a = new ArrayClass<String>();
        String[] array = {"member1","member2","member3","member4","member5",};
        a.SetT(array);//调用Set()方法
        for (int i=0; i<a.getT().length; i++){
            System.out.println(a.getT()[i]);//调用get()方法返回数组的值
        }
    }
}
