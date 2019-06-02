package book.Chapter_fifteen;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Decompressing {
    public static void main(String[] args) {//主方法
        File file = new File("decompressing.zip");//当前压缩文件
        ZipInputStream zin;//创建ZipInputStream对象
        try {//try语句捕获可能发生的异常
            ZipFile zipFile = new ZipFile(file);//创建压缩文件对象
            zin = new ZipInputStream(new FileInputStream(file));//实例化对象，指明要进行解压的文件
            ZipEntry entry = zin.getNextEntry();//跳过根目录指向下一个entry
            while (((entry=zin.getNextEntry())!=null)&&!entry.isDirectory()){//
                File tmp = new File("D:\\"+entry.getName());//解压出的文件路径
                if (!tmp.exists()){//若改文件不存在
                    tmp.getParentFile().mkdir();//创建费文件的父类文件夹路径
                    OutputStream os = new FileOutputStream(tmp);//将文件目录中的文件放入输出流
                    //用输入流读取压缩文件中制定目录中的文件
                    InputStream in = zipFile.getInputStream(entry);
                    int count = 0;//创建临时变量
                    while ((count=in.read())!=-1){//如果输入流可以读到数值
                        os.write(count);//写出输入流
                    }
                    os.close();//关闭输出流
                    in.close();//关闭输入流
                }
                zin.closeEntry();//关闭当前entry
                System.out.println(entry.getName()+"解压成功");
            }
            zin.close();//关闭流
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
