/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tata.bfp.win.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * Conexión Oracle 11g con driver jdbc6
 * 
 */
public class CV02ConexionSQLServer2008 {

    private static Connection moCxn;
    private static String msDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String msServidor = "jdbc:sqlserver://SVBDBFDES04:";
    private static String msBaseDatos = "BFP_LEASING;";
    private static String msUsuario = "usr_leasing";
    private static String msClave = " sSS3lv‡r‡GE4K)";
    private static String mStrPuerto = "1433;";


    private static String msUrl = msServidor + mStrPuerto + " database = " + msBaseDatos + "user = " + msUsuario + "password = " + msClave;
                                              
    public static void main(String[] args) {
        try{
            Class.forName(msDriver);
            System.out.println(msDriver);
            
            System.out.println(Class.forName(msDriver));
            
            moCxn = DriverManager.getConnection(msUrl, msUsuario, msClave);
            
            System.out.println(moCxn);
        }catch(ClassNotFoundException oCNFE){
            System.out.println(oCNFE.getStackTrace());
            
            System.out.println(oCNFE.getMessage());
        }catch(SQLException oSQL){
            System.out.println(oSQL.getMessage());
        }
    }

    
}
