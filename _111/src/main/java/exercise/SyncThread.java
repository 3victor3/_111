package exercise;

public class SyncThread implements Runnable{
    private static int count;

    public SyncThread(){
        count = 0;
    }

    public void run(){
        synchronized (this){
            for (int i = 0;i < 5; i++){
                try {
                    System.out.println(Thread.currentThread().getName()+":"+(count++));
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
      /*  SyncThread syncThread = new SyncThread();两个线程公用一个对象
        Thread thread1 = new Thread(syncThread,"SyncThread1");
        Thread thread2 = new Thread(syncThread,"SyncThread2");
        thread1.start();
        thread2.start();*/

//        SyncThread syncThread = new SyncThread();两个对象
        Thread thread1 = new Thread(new SyncThread(),"SyncThread1");
        Thread thread2 = new Thread(new SyncThread(),"SyncThread2");
        thread1.start();
        thread2.start();
    }
}
