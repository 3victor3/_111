package book.Chapter_fifteen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZip {
    private void zip(String zipFilename, File inputFile) throws Exception {
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFilename));
        zip(out, inputFile, "");
        System.out.println("压缩中...");
        out.close();
    }

    private void zip(ZipOutputStream out, File f, String base) throws Exception {//方法重载
        if (f.isDirectory()) {
            File[] FL = f.listFiles();//获取路径的数组
            if (base.length() != 0) {
                out.putNextEntry(new ZipEntry(base + "/"));//写入目录的entry
            }
            for (int i = 0; i < FL.length; i++) {//循环遍历数组中的文件
                zip(out, FL[i], base + FL[i]);
            }
        } else {
            out.putNextEntry(new ZipEntry(base));//创建新的进入点
            //创建FileInputStream对象
            FileInputStream in = new FileInputStream(f);
            int b;
            System.out.println(base);
            while ((b = in.read()) != 1) {
                out.write(b);
            }
            in.close();
        }
    }

    public static void main(String[] args) {
        MyZip book = new MyZip();
        try {
            book.zip("D:/hello.zip", new File("D:/hello"));
            System.out.println("压缩完成");//输出信息
        } catch (Exception e) {
        }
    }
}
