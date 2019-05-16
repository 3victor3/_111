package book.Chapter_fifteen;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        File file = new File("word.txt");
        if (file.exists()){
            String name = file.getName();//获取文件名
            long length = file.length();//获取文件长度
            boolean hidden = file.isHidden();//是否为隐藏文件
            boolean read = file.canRead();//文件是否可读
            boolean write = file.canWrite();//文件是否可写
            long date = file.lastModified();//文件最后被修改的日期
            String abspath = file.getAbsolutePath();//获取文件的绝对路径
            System.out.println(name+"   "+length+"   "+hidden+"   "+read+"   "+write+"   "+date);
            System.out.println(abspath);
        }else {
            System.out.println("文件不存在");
        }
    }
}
