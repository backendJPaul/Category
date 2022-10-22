package com.jpaul;

import com.jpaul.dao.DAO;

public class App{
    public static void main(String args[]) throws Exception {
        DAO dao = new DAO();
        dao.connectDatabase();
    }

}
