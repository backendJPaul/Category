package com.jpaul;

import com.jpaul.dao.CategoryDAO;
import com.jpaul.dao.DAO;
import com.jpaul.model.Category;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class App{
    public static void main(String args[]) throws Exception {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcategory","admin","root");
        CallableStatement callableStatement = connection.prepareCall("call stpCCategory(?)");
        callableStatement.setString(1,"cellphones");
        /*prepare sentence*/
        callableStatement.executeQuery();
        ResultSet resultSet = callableStatement.getResultSet();

        while(resultSet.next()){
            System.out.println(resultSet.getString("idCategory"));
            System.out.println(resultSet.getString("name"));
        }


    }


}
