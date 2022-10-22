package com.jpaul.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    protected Connection connection;
    protected Statement statement;

    private final String user = "admin";
    private final String pass = "root";
    private final String database = "dbcategory";

    //TODO change to protected
    public void connectDatabase() throws Exception {
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcategory","admin","root");
        }
        catch(SQLException e){
            throw new Exception(e.toString());
        }

    }
}
