package book.Chapter_fifteen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest3 {
    public static void main(String[] args) {
        File file = new File("word.txt");
        try {
            //创建对象
            FileOutputStream out = new FileOutputStream(file);
            //创建byte型数组
            byte[] b = "我有一个小马哥我从来没也不骑。".getBytes();
            out.write(b);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //创建对象
            FileInputStream in = new FileInputStream(file);
            byte[] byt = new byte[1024];
            int len = in.read(byt);
            System.out.println("文件中的信息是:" + new String(byt, 3, len));//这里的方法是byt从第0开始到len结束拼接成新的字符串
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
