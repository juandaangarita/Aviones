package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Juan David Angarita
 * @email juandaangarita@gmail.com
 */
public class ConnectionDB {
    public static Connection getConnection() {
        Connection conn = null;
        // conectar
        try {
            String dbURL = "jdbc:mysql://localhost:3306/aeronaves" ;
            String username = "root";
            String password = "angarita93";
            
            conn = DriverManager.getConnection(dbURL, username, password);
            //if( conn != null ) 
                //System.out.println ( "Conectado" );
        } 
        catch( SQLException ex ) {
            ex.printStackTrace();
        }
        
        return conn;
    }
    
    public static void main(String[] args){
        getConnection();
    }
}
