/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tata.bfp.db2.vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * Conexión DB2 del AS400 con driver jt400-6.4
 * 
 */
public class CV03ConexionDB2AS400 {

    private static Connection moCxn;
    
    
    public static void main(String[] args) {
        String lsDriver = "com.ibm.as400.access.AS400JDBCDriver";
        String lsServidor = "jdbc:as400://";
        String lsBaseDeDatos = "LAMBDA";
        String lsURL = lsServidor + lsBaseDeDatos;
        String lsUsuario = "BFPALEDIA";
        String lsClave = "VASQUEZ3";
    
        try{
            Class.forName(lsDriver);
            System.out.println(lsDriver);
            
            System.out.println(Class.forName(lsDriver));
            
            moCxn = DriverManager.getConnection(lsURL, lsUsuario, lsClave);
            
            if (moCxn != null){
                
                System.out.println("Conexion satisfactoria .....! " + moCxn);
            }
        }catch(ClassNotFoundException oCNFE){
            System.out.println(oCNFE.getStackTrace());
            
             System.out.println("No se ha podido cargar el Driver JDBC -----> " + oCNFE.getMessage());
        }catch(SQLException oSQL){
            System.out.println("Conexion No Satisfactoria .....?");
             
            System.out.println(" -----> " + oSQL.getMessage());
        }        
    }
    
}
