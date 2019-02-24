package exercise;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //next method
        System.out.println("next方式接收：");
        //
        if (s.hasNextLine()){
            String s1 = s.nextLine();
            System.out.println("输出的数据为："+s1);
        }
        s.close();
    }
}
