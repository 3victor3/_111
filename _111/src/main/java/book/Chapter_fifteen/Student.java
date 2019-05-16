package book.Chapter_fifteen;

import java.io.*;

public class Student {
    public static void main(String[] args) {
        //定义字符串数组
        String[] content = {"好久不见","您好么","常联系"};
        File file = new File("student.txt");
        try {
            FileWriter fw = new FileWriter(file);
            //创建BufferedWriter对象
            BufferedWriter bufw = new BufferedWriter(fw);
            for (int k=0; k<content.length; k++){//循环遍历数组
                bufw.write(content[k]);//一个一个元素写入
                bufw.newLine();//换行
            }
            bufw.close();
            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            FileReader fr = new FileReader(file);
            //创建BufferedRead对象
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;//创建字符串对象
            int i = 0;
            //如果文本行数不为null，则进入循环
            while ((s=bufr.readLine()) != null){
                i++;
                System.out.println("第"+i+"行："+s);
            }
            bufr.close();
            fr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
