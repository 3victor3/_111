package book.Chapter_ninteen;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Receive extends JFrame implements Runnable, ActionListener {
    int port;//
    InetAddress group = null;//
    MulticastSocket socket = null;//
    JButton ince = new JButton("开始接受");
    JButton stop = new JButton("停止接受");
    JTextArea inceAr = new JTextArea(10,10);//
    JTextArea inceD = new JTextArea(10,10);//
    Thread thread;//
    boolean b = false;//
    public Receive(){//
        super("广播数据包");//
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thread = new Thread(this);//
        ince.addActionListener(this);//
        stop.addActionListener(this);//
        inceAr.setForeground(Color.BLUE);//
        JPanel north = new JPanel();
        north.add(ince);//
        north.add(stop);//
        add(north,BorderLayout.NORTH);//
        JPanel center = new JPanel();//
        center.setLayout(new GridLayout(1,2));//
        center.add(inceAr);//
        center.add(inceD);//
        add(center,BorderLayout.CENTER);//
        validate();//
        port = 9898;//
        try{
            group = InetAddress.getByName("224.255.10.0");//
            socket = new MulticastSocket(port);//
            socket.joinGroup(group);//
        }catch (Exception e){
            e.printStackTrace();
        }
        setBounds(100,50,360,380);
        setVisible(true);
    }

    public void run(){
        while (true){
            byte[] data = new byte[1024];//
            DatagramPacket packet = null;
            //
            packet = new DatagramPacket(data,data.length,group,port);//
            try{
                socket.receive(packet);//
                String message = new String(packet.getData(),0,packet.getLength());//
                //
                inceAr.setText("正在接收的内容：\n"+message);
                inceD.append(message+"\n");//
            }catch (Exception e){
                e.printStackTrace();//
            }
            if (b == false){//
                break;
            }
        }
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == ince){
            ince.setBackground(Color.RED);//
            stop.setBackground(Color.YELLOW);//
            if (!(thread.isAlive())){
                thread = new Thread(this);//
            }
            thread.start();//
            b = false;//
        }

        if (e.getSource() == stop){
            ince.setBackground(Color.YELLOW);//
            stop.setBackground(Color.RED);//
            b = true;//
        }
    }

    public static void main(String[] args) {
        Receive rec = new Receive();//
        rec.setSize(460,200);//
    }
}
