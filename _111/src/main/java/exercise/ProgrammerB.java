package exercise;

import sun.rmi.runtime.Log;



public class ProgrammerB {

    public void doWork(Callback callback, String event){

        System.out.println("程序员A告诉程序员B需要干的事情："+event);

        System.out.println("程序员："+"干活。。。。。。");

        String result = "完成工作";

        //B告诉A完成，使用了回调方法
        callback.event(result);
    }
}
