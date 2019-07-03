package book.Chapter_eighteen;

public class ThreadTest extends Thread {//指定类集成thread类
    private int count = 10;
    public void run(){//重写run方法
        while (true){
            System.out.print(count+" ");//打印count变量
            if (--count == 0){//自减count变量，当自减为0的时候，退出循环
                return;
            }
        }
    }

    public static void main(String[] args) {
        new ThreadTest().start();//调用线程
    }
}
