package me.common.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created on 2017/8/10
 */
public class Jdbc {
    public static void main(String[] args) throws Exception {
         {
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql:// / ";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, " ", " ");
        } catch (Exception c) {
            c.printStackTrace();
        }
        Statement st = null;
        try {
            st = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet re = st.executeQuery("SELECT * FROM ");
        while (re.next()) {
            System.out.println();
        }

    }
}
