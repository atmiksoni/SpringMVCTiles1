package com.test;

import java.sql.*;

/**
 * Created by soniiatm on 5/19/2017.
 */
public class JDBCExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Step 1 : Load ot register driver
        Class.forName("jdbc.oracle.driver.OracleDriver"); //Throws ClassNotFoundException
        //Step 2 Create Connection Object
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
        //Throws SQL Excpetion
        //Step 3 create statement Object
        Statement statement = connection.createStatement();

        //step 4 excecute query
        ResultSet resultSet = statement.executeQuery("select * from emp");
        //Step 5 close the connection
        resultSet.close();

        statement.close();

        connection.close();

    }
}
