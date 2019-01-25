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
 * Conexión Oracle 11g con driver jdbc6
 * 
 */
public class CV01ConexionOracle11g {

    private static Connection moCxn;
    private static String msDriver = "oracle.jdbc.driver.OracleDriver";
    private static String msBaseDeDatos = "jdbc:oracle:thin:@//172.17.15.44:1521/ORADES";
    private static String msUsuario = "USUALSA";
    private static String msClave = "ALSA01";
        
    public static void main(String[] args) {
        
        try{
            Class.forName(msDriver);
            System.out.println(msDriver);
            
            System.out.println(Class.forName(msDriver));
            
            moCxn = DriverManager.getConnection(msBaseDeDatos, msUsuario, msClave);
            if (moCxn != null){
                System.out.println("Conexion satisfactoria .....! " + moCxn);
            }
            
        }catch(ClassNotFoundException oCNFE){
            System.out.println(oCNFE.getStackTrace());
            
            System.out.println(oCNFE.getMessage());
        }catch(SQLException oSQL){
            System.out.println(oSQL.getMessage());
        }
    }
    
}
