package homework;
/*
有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
import java.util.Scanner;

public class RABBIT_SUM {
    public static void main(String[] args) {
        int i;
        System.out.println("请输入月份");
        Scanner input = new Scanner(System.in);
        i = input.nextInt();//控住输入类型为int
        int[] rab = new int[100];//注意数组的大小
        rab[0] = rab[1] = 1;
        if (i<=0){
            System.out.println("请输入合法月份");
        }
        if (i==1||i==2){
            System.out.println("第"+i+"个月有"+rab[i-1]+"只兔子");
        }
        int rabbit;
        if (i>=3){
            for (int j=3; j<i; j++){
            rab[j-1] = rab[j-2]+rab[j-3];//注意使用j的时候算清楚和i的关系
            //System.out.println(rab[j]);
            rabbit = rab[j-1];
            System.out.println("第"+j+"个月"+"一共有"+rabbit+"对兔子");
            }
            System.out.println("空格");
        }
    }

}
