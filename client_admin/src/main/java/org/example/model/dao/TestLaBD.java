package org.example.model.dao;
import org.example.model.dao.ConnectDB;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestLaBD {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            ConnectDB connectDB = new ConnectDB(ConnectDB.MYSQL, "192.168.254.128", "PourStudent", "Student", "PassStudent1_");
            String requete  = "Select * from patient";
            ResultSet rs = connectDB.executeQuery(requete);
            while (rs.next()) {
                System.out.println(rs.getString(rs.getString("fist_name")));
            }
            rs.close();
            connectDB.close();

        }catch (Exception e) {

        }

    }
}
