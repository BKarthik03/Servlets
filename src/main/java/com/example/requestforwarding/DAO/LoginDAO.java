package com.example.requestforwarding.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    String url = "jdbc:mysql://localhost:3306/users";
    String user = "root";
    String password = "yourpassword";
    String query = "select * from servletUser where name = ? and password = ?;";
    public boolean check(String uname, String pass){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, uname);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
