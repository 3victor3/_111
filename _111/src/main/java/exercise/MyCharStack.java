package exercise;

public class MyCharStack {
    private char[] array;
    private int maxSize;
    private int top;

    public MyCharStack(int size){
        this.maxSize = size;
        array = new char[size];
        top = -1;
    }

    //
    public void push(char value){
        if (top<maxSize-1){
            array[++top] = value;
        }
    }

    //
    public char pop(){
        return array[top--];
    }


    //
    public char peek(){
        return array[top];
    }

    //
    public char peekN(int n){
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
