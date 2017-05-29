package com.H2.start;



import com.H2.core.H2Core;
import com.H2.dao.H2Dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    public static void main (String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        H2Dao Create = (H2Dao)context.getBean("dao");
        Create.CreateTable();

        H2Dao Insert = (H2Dao)context.getBean("dao");
        Insert.InsertToTable();

        H2Dao Select = (H2Dao)context.getBean("dao");
        //Select.SelectFromTable();
        //ResultSet result = Select.SelectFromTable();
        //System.out.println(result);
        List<H2Core> list = Select.getAllH2CoreRowMapper();

        for(H2Core h:list)
            System.out.println(h);


        /*H2Dao Delete = (H2Dao)context.getBean("dao");
        Delete.DeleteFromTable();*/
    }

}
