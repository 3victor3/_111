package exercise;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack(7);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.peek());
        while (!stack.isEmpty()){
            System.out.println(stack.top());
        }
    }
}
