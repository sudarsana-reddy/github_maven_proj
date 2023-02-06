package org.sud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class Calculator
{
    String username = "dummy";
    public Integer add(Integer num1, Integer num2){
        return num1 + num2;
    }

    public void test() throws SQLException {
        Connection conn = null;

        try{
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user", System.getProperty("username"),  System.getProperty("password"));
        }catch (Exception e){
           System.out.println(e.getMessage());
        }finally {
            conn.close();
        }
    }
}
