package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbManagerTestSuite {
    @Test
    void testConnection() throws SQLException {
        DbManager dbManager = DbManager.getInstance();

        assertNotNull(dbManager.getConnection());
    }
    @Test
    void testSelectUsers() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();
        //when
        String sqlQuery = "Select * from USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
            rs.getString("FIRSTNAME") + ", " +
            rs.getString("LASTNAME"));
            counter ++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);


    }
    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sqlQuery = "select U.FIRSTNAME, U.LASTNAME, count(*) \n" +
                "from POSTS P join USERS U ON U.ID = P.USER_ID \n" +
                "group by USER_ID\n" +
                "having count(*) > 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter ++;
        }
        rs.close();
        statement.close();
        assertEquals(3, counter);

    }
}
