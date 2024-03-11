package br.com.alura.comex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection con(){
        try {
       return DriverManager.getConnection("jdbc:mysql://localhost:3306/comex?user=root&password=979780");

    } catch(SQLException ex) {
throw new RuntimeException(ex);
        }
    }

    }

