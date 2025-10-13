package DAO;

import Model.Alien;
import java.sql.*;

public class AlienDAO {
    Connection c = null;
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aliens","root","yourpassword");
            return conn;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //Read
    public Alien getAlien(int aid){
        Alien a = new Alien();

        String query = "select * from alien where aid = ?";
        c = getConnection();
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setInt(1, aid);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                a.setaId(rs.getInt("aId"));
                a.setName(rs.getString("aName"));
                a.setTech(rs.getString("tech"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return a;
    }

    //Create
    public boolean addAlien(Alien alien){
        String query = "insert into  alien values(?,?,?);";
        c = getConnection();

        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setInt(1,alien.getaId());
            ps.setString(2,alien.getName());
            ps.setString(3,alien.getTech());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
