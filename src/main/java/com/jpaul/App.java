package com.jpaul;

import com.jpaul.dao.CategoryDAO;
import com.jpaul.dao.DAO;
import com.jpaul.model.Category;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class App{
    public static void main(String args[]) throws Exception {
        CategoryDAO categoryDAO = new CategoryDAO();

        Category category = new Category();
        category.setIdCategory(8);


        Category category1 = categoryDAO.gotoId(category);

        System.out.println(category1.getIdCategory());
        System.out.println(category1.getName());
    }
}
