package db;

import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;

import javax.swing.*;
import java.sql.*;

/**
 * Created by ivamesu on 7/28/2016.
 */
public class ConnectToDB {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/user";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    private Connection connection;

    public ConnectToDB() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        return connection;
    }


}
