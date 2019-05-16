package book.Chapter_fifteen;

import java.io.*;

public class Example_01 {
    public static void main(String[] args) {
        try {
            //创建FileOutputStram对象
            FileOutputStream fs = new FileOutputStream("example_01.txt");
            //
            DataOutputStream ds = new DataOutputStream(fs);
            ds.writeUTF("使用UTF方法写入数据");//写入磁盘文件数据
            ds.writeChars("使用chars方法写入数据");
            ds.writeBytes("使用bytes方法写入数据");
            ds.close();//关闭流
            //
            FileInputStream FIS = new FileInputStream("example_01.txt");
            //
            DataInputStream DIS =   new DataInputStream(FIS);
            System.out.println(DIS.readUTF());//将文件数据输出
        }catch (Exception e){
            e.printStackTrace();//输出异常信息
        }
    }
}
