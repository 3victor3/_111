package exercise;

import java.util.Scanner;

public class testInfixToSuffix {
    public static void main(String[] args) {
        String input;
        System.out.println("enter infix");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        InfixToSuffix in = new InfixToSuffix(input);
        MyCharStack my = in.doTrans();
        my.displayStack();
    }
}
