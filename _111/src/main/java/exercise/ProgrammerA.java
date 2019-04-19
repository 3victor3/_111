package exercise;

import sun.rmi.runtime.Log;

public class ProgrammerA implements Callback{

    //引用对象b
    private ProgrammerB PB;

    //构造方法持有b
    public ProgrammerA(ProgrammerB PB){
        this.PB = PB;
    }

    //通过方法告诉b任务
    public void doEvent(final String event){
        //异步线程
        new Thread(new Runnable() {
            public void run() {
                //A调用B中的方法，注册回调接口
                PB.doWork(ProgrammerA.this,event);
            }
        }).start();
    }

    public void event(String result){
        System.out.println("程序员B告诉程序员A："+ result);
    }
}
