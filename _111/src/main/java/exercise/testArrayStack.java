package exercise;

public class testArrayStack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(1);
        System.out.println("当前栈最顶端"+stack.peek());
        stack.push(2);
        stack.push(3);
        stack.push("abc");
        System.out.println("当前栈最顶端"+stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }
}
