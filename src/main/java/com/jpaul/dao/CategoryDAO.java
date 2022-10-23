package com.jpaul.dao;

import com.jpaul.model.Category;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO extends DAO implements IDAOCategory {

    public Category create(Category o) throws Exception {

        return null;
    }

    public List<Category> read() throws Exception {
        this.connectDatabase();

        CallableStatement callableStatement = this.connection.prepareCall("call stpRCategory");
        this.resultSet = this.executeQuery(callableStatement);

        ArrayList<Category> categories = new ArrayList<Category>();
        while(resultSet.next()){
            Category category = new Category();
            category.setIdCategory(resultSet.getInt("idCategory"));
            category.setName(resultSet.getString("name"));
            categories.add(category);
        }
        return categories;
    }

    public Category update(Category o) throws Exception {
        return null;
    }

    public Category delete(Category o) throws Exception {
        return null;
    }

    public List<Category> search(String pattern) throws Exception {
        return null;
    }

    public Category gotoId(Category o) throws Exception {
        return null;
    }
}
