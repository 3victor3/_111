package book.Chapter_ninteen;


import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Weather extends Thread {//创建类，该类为多线程执行
    String weather = "节目预报：晚上八点有晚会。";
    int port = 9898;//定义端口
    InetAddress iaddress = null;//创建Inetaddress对象
    MulticastSocket socket = null;//声明多点广播套接字
    Weather(){
        try{
            iaddress = InetAddress.getByName("224.255.10.0");//实例化Inetaddress类型对象并指定地址
            socket = new MulticastSocket(port);//实例化多点广播套接字
            socket.setTimeToLive(1);//指定发送范围
            socket.joinGroup(iaddress);//
        }catch (Exception e){
            e.printStackTrace();//输出错误日志
        }
    }

    public void run(){//run()方法
        while (true){
            DatagramPacket packet = null;//声明DatagramPacket对象
            byte[] data = weather.getBytes();//声明组数字节
            //数据打包
            packet = new DatagramPacket(data,data.length,iaddress,port);
            System.out.println(new String(data));//广播信息输出
            try{
                socket.send(packet);//发送数据
                sleep(3000);//线程休眠
            }catch (Exception e){
                e.printStackTrace();//输出异常信息
            }
        }
    }

    public static void main(String[] args) {
        Weather w = new Weather();//创建本类对象
        w.start();//启动线程
    }
}
