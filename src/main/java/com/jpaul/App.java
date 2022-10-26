package com.jpaul;

import com.jpaul.dao.impl.DAOManager;

public class App{
    public static void main(String args[]) throws Exception {

        DAOManager daoManager = new DAOManager();
        System.out.println("read() " + daoManager.getCategoryDAO().read().toString());
    }
}
