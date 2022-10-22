package com.jpaul.dao;

import java.sql.*;

public class DAO {
    protected Connection connection;
    protected Statement statement;
    protected ResultSet resultSet;

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
    //TODO change to protected
    public void disconnectDatabase()throws Exception{
        try{
            if(resultSet != null){
                resultSet.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
        catch(SQLException e){
            throw new Exception(e.toString());
        }
    }
}
