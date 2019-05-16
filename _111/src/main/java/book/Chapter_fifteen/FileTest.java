package book.Chapter_fifteen;

import java.io.File;

public class FileTest {//创建类FILETEST

    public static void main(String[] args) {
        File file = new File("word.txt");//实例化
        if (file.exists()){//判断文件是否存在
            file.delete();//删除文件
            System.out.println("文件已经删除");
        }else {
            try {
                file.createNewFile();//创建改文件
                System.out.println("文件已经创建");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
