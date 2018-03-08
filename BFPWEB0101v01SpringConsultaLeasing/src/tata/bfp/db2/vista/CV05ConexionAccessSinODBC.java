/*
 * 
 * 
 * 
 */
package tata.bfp.db2.vista;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 *  Con JDK8 se ha retirado el driver de conexion a accees por ODBC: sun.jdbc.odbc.JdbcOdbcDriver 
 *  Se requiere para una conexion JDBC utilizar las siguientes librerias en un grupo
 *  a) ucanaccess-3.0.6.jar
 *  b) hsqldb-2.3.4.jar
 *  c) jackcess-2.1.3.jar
 *  d) commons-logging-1.1.3.jar  
 *  e) commons-lang-2.6.jar  
 *
 */
public class CV05ConexionAccessSinODBC {

    private static Connection moCxn;
    
    public static void main(String[] args) {

        String lsDriver = "jdbc:ucanaccess://";
        String lsServidor = "D:\\2016\\DataBase\\Access\\";
        String lsBaseDatos = "BFPLeasing.accdb";
        String lsURL = lsDriver + lsServidor + lsBaseDatos;
        
        try{
            
            moCxn = DriverManager.getConnection(lsURL);
            if (moCxn != null){
                System.out.println("Conexion satisfactoria .....! " + moCxn);
            }

        }catch(SQLException oSQL){
            System.out.println("Conexion No Satisfactoria .....?");
            
            System.out.println(" -----> " + oSQL.getMessage());
        }
    }
    
}
