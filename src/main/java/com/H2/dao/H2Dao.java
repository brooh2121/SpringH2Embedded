package com.H2.dao;

import com.H2.core.H2Core;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class H2Dao {
    JdbcTemplate template;
    public void setTemplate(JdbcTemplate template) {this.template = template;}
    public void CreateTable(){
        template.execute("CREATE table if NOT EXISTS Test(ID INT, NAME VARCHAR(20))");
        System.out.println("Table created successfully...");
    }
    public void InsertToTable(){
        template.execute("INSERT into Test values (1,'GayHunter')");
        System.out.println("Insert 1 row successfully...");
    }
    /*public void SelectFromTable(){template.execute("Select * from Test");
    }*/

    public List<H2Core> getAllH2CoreRowMapper(){
        return template.query("Select * from Test", new RowMapper<H2Core>() {
            @Override
            public H2Core mapRow(ResultSet resultSet, int rownumber) throws SQLException {
                H2Core h = new H2Core();
                h.setId(resultSet.getInt("id"));
                h.setName(resultSet.getString("name"));
                return h;
            }
        });

    }
    public void DeleteFromTable(){
        template.execute("DELETE from Test");
        System.out.println("Delete complited");
    }
}