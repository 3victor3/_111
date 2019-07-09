package exercise;

public class MyIntStack {
    private int[] array;
    private int maxSize;
    private int top;

    public MyIntStack(int size){
        this.maxSize = size;
        array = new int[size];
        top = -1;
    }

    //
    public void push(int value){
        if (top<maxSize-1){
            array[++top] = value;
        }
    }

    //
    public int pop(){
        return array[top--];
    }


    //
    public int peek(){
        return array[top];
    }

    //
    public int peekN(int n){
        return array[n];
    }

    //
    public void displayStack(){
        System.out.println("STACK(BOTTOM-->TOP)");
        for (int i=0; i<top+1; i++){
            System.out.print(peekN(i)+" ");
        }
        System.out.println();
    }

    //
    public boolean isEmpty(){
        return (top == -1);
    }

    //
    public boolean isFull(){
        return (top == maxSize-1);
    }
}
