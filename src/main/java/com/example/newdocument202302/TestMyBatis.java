package com.example.newdocument202302;

import com.example.newdocument202302.dto.UserDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMyBatis {


    @Test
    public void one(){

    }

    /**
     * JDBC创建连接
     */
    public void jdbcHello() throws Exception{

        //编写jdbc代码   通过DriverManager进行驱动注册和数据库连接
        //1.注册jdbc驱动
        //DriverManager.registerDriver(new Driver());
        //底层Driver类的源码中通过静态代码块类加载的时候已经进行了new Driver()操作，所以我们不需要在进行注册，直接获取
        Class.forName("com.mysql.jdbc.Driver");//在jar中的路径
        //2.获取数据库连接
        /*
         * url		 数据库连接地址  String类型
         * user		  用户名  String类型
         * password  密码	  String类型
         * */
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDB", "root", "root");

        //3.通过连接创建sql语句执行器对象
        //3.1  sql语句编写
        String sql = "select `id`,`name`,`author`,`price`,`sales`,`stock`,`publishing` from t_book";
        //3.2  创建sql语句执行器Statement对象
        Statement statement = (Statement) connection.createStatement();
        //3.3执行sql语句   找到对应的方法(2个)
        ResultSet rs = statement.executeQuery(sql);

        //4.获取sql语句执行结果  rs.next()向下移动是否成功，成功为true，失败为false
        while (rs.next()) {
            //4.1创建对应数据库表实体类对象
            UserDTO book = new UserDTO();
            book.setUserId("1");//根据索引获取结果，按照列的索引，第一列为1.。。第n列为n
            book.setUserName(rs.getString("name"));//按照列名进行结果获取
            //后台打印结果
            System.out.println(book);
        }
        //5.最后一步：关闭结果集ResultSet,sql执行器Statement,connection连接，释放资源；
        rs.close();
        statement.close();
        connection.close();
    }


    /**
     * mybatis原理
     * myabatis.xml中配置JDBC信息连接数据库
     * @throws Exception
     */
    @Test
    public void selectTest() throws Exception{
        //得到流对象，读取配置文件信息
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //通过配置信息入参，创建SqlSessionFactoryBuilder对象实例
        //一般情况下，一个数据库只有一个sqlsessionFactory对象实例
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过sqlsessionfactory对象创建sqlsession对象
        //session相当于JDBC中的connection连接，每次使用完一定要关闭
        SqlSession session = sessionFactory.openSession();
        //selectOne是执行查询只返回一行记录的sql语句方法
        /*第一个参数是sql语句：sql语句是由名称空间namespace和id唯一标识组成
         * 第二个参数是sql语句中对应的参数（占位符）
         * */
        try {
            User user = session.selectOne("com.atguigu.pojo.User.selectUserById", 1);
            System.out.println(user);
        } catch (Exception e) {
            // TODO: handle exception
        }finally{
            session.close();
        }
    }


}
