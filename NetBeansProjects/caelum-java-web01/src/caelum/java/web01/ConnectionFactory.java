/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caelum.java.web01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author proto
 */
public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "root");
        }
        
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
