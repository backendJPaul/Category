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
        CategoryDAO categoryDAO = new CategoryDAO();
        System.out.println(categoryDAO.read().toString());


    }


}
