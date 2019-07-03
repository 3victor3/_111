package book.Chapter_ninteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTcp {
    private BufferedReader reader;//创建BufferReader对象
    private ServerSocket server;//创建serversocket对象
    private Socket socket;//创建socket对象

    void getServer() {//getServer方法
        try {
            server = new ServerSocket(8998);//实例化服务器对象，绑定了8998端口
            System.out.println("服务器套接字已经创建成功");//输出信息
            while (true) {//如果socket是
                System.out.println("等待客户机的链接");//输出信息
                socket = server.accept();//实例化socket对象
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//实例化BufferReader对象
                getClientMessage();//调用方法
            }
        } catch (Exception e) {//抛出异常
            e.printStackTrace();
        }
    }

    private void getClientMessage() {
        try {
            while (true) {//如果套接字是连接状态
                //获得客户端信息
                System.out.println("客户机：" + reader.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (reader!=null){
                reader.close();//关闭流
            }
            if (socket!=null){
                socket.close();//关闭套接字
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {//主方法
        MyTcp tcp = new MyTcp();//调用本类对象
        tcp.getServer();//调用方法
    }
}
