package exercise;


import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {
    //
    private Object[] elementData;
    //
    private int top;
    //
    private int size;

    //
    public ArrayStack(){
        this.elementData = new Object[10];
        this.top = -1;
        this.size = 10;
    }

    public ArrayStack(int initialCapacity){
        if (initialCapacity<0){
            throw new IllegalArgumentException("栈初始容量不能小于0"+initialCapacity);
        }
        this.elementData = new Object[initialCapacity];
        this.top = 1;
        this.size = initialCapacity;
    }

    public Object push(Object item){
        //
        isGrow(top+1);
        return elementData[++top] = item;
    }

    //
    public Object pop(){
        Object obj = peek();
        remove(top);
        return obj;
    }

    //
    public Object peek(){
        if (top == -1){
            throw new EmptyStackException();
        }
        return elementData[top];
    }

    //
    public boolean isEmpty(){
        return (top == -1);
    }

    //
    private void remove(int top){
        //
        elementData[top] = null;
        this.top--;
    }

//    是否需要扩容，如果需要扩大一倍并且返回true；
//    如果不需要就返回false
//    @param minCapacity
//    @return
    public boolean isGrow(int minCapacity){
        int oldCapacity = size;
        //
        if (minCapacity >= oldCapacity){
            //
            int newCapacity = 0;
            //
            if ((oldCapacity<<1) - Integer.MAX_VALUE > 0){
                newCapacity = Integer.MAX_VALUE;
            }else {
                newCapacity = (oldCapacity<<1);//
            }
            this.size = newCapacity;
            int[] newArray = new int[size];
            elementData = Arrays.copyOf(elementData,size);
            return true;
        }else {
            return false;
        }
    }
}
