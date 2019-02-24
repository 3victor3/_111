package how2j_object;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class javaTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
        String URL="jdbc:t4jdbc://192.168.0.11:23400/:";
        String USER="db__root";
        String PASSWORD="traf123";
        //1.加载驱动程序
        Class.forName("org.trafodion.jdbc.t4.T4Driver");
        //2.获得数据库链接
        Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("get Tables");
        //4.处理数据库的返回结果(使用ResultSet类)
        while(rs.next()){
            System.out.println(rs.getString(1));
        }

        //关闭资源
        rs.close();
        st.close();
        conn.close();
    }
}
