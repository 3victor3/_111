package book.Chapter_ninteen;

import java.net.InetAddress;//导入java.net包
import java.net.UnknownHostException;//导入

public class Address {
    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            String localname = ip.getHostName();
            String localip = ip.getHostAddress();
            System.out.println("本机名"+localname);
            System.out.println("本机IP地址"+localip);
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }

}
