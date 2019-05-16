package book.Chapter_fifteen;

//这一页的代码有点问题

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ftest extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel jContectPane = null;//创建面板对象
    private JTextArea jTextArea = null;//创建文本域对象
    private JPanel controlPanel = null;//创建面板对象
    private JButton openButton = null;//创建按钮对象
    private JButton closeButton = null;//创建按钮对象

    //省略窗口布局代码

    //openbutton method
    private JButton getOpenButton(){
        if (openButton == null){
            openButton = new JButton();
            openButton.setText("写入文件");
            openButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //创建文件对象
                    File file = new File("Ftest.txt");
                    try{
                        //创建filewriter对象
                        FileWriter out = new FileWriter(file);
                        //获取文本域中的文本
                        String s = jTextArea.getText();
                        out.write(s);
                        out.close();
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;
    }

    //closebutton method
    private JButton getCloseButton(){
        if (closeButton == null){
            closeButton = new JButton();
            closeButton.setText("读取文件");
            closeButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    File file = new File("Ftest.txt");
                    try{
                        FileReader in = new FileReader(file);
                        char[] byt = new char[1024];
                        int len = in.read(byt);//将字节读入数组
                        //设置文本域显示的信息
                        jTextArea.setText(new String(byt,0,len));
                        in.close();
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return closeButton;
    }

    private void initialize(){
        this.setSize(300,200);
        this.setContentPane(getContentPane());
        this.setTitle("ftest");
    }

    public Ftest(){
        super();
        initialize();
    }

    private JTextArea getJTextArea(){
        return jTextArea;
    }

    private JPanel getControlPanel(){
        return controlPanel;
    }

    private JPanel getjContentPane(){
        if (jContectPane == null){
            jContectPane = new JPanel();
            jContectPane.setLayout(new BorderLayout());
            jContectPane.add(getJTextArea(),BorderLayout.CENTER);
            jContectPane.add(getControlPanel(),BorderLayout.SOUTH);
        }
        return jContectPane;
    }

    public static void main(String[] args) {
        Ftest thisClass = new Ftest();
        thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thisClass.setVisible(true);//设置窗体可见
    }
}
