package org.sud;


import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class Calculator
{
    
    public Integer add(Integer num1, Integer num2){
        return num1 + num2;
    }

    public boolean test(){
        String username = System.console().readLine();
        String password = System.console().readLine();
        // Unsafe query which uses string concatenation
        String query = "select * from tbluser where username='" + username + "' and password = '" + password + "'";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user", "root", "root");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {}
        }
        return true;

    }

}
