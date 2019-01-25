/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tata.bfp.db2.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 *
 */
public class CDConexionSQLServer {

    private Connection oSQLCxn;
    
    public Connection getOpenSQLServer(){
        
        // El driver sqljdbc4.1.jar requiere el java 7.0 Java Runtime Environment 
        // El driver sqljdbc4.2.jar requiere el java 8.0 Java Runtime Environment 
        String lStrControlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String lStrTipoDriver = "jdbc:sqlserver:";
        String lStrServidor = "//INVERTEC:";
        String lStrPuerto = "1433;";
        String lStrBaseDatos = "aemsadesarrollo;";

        String lStrUsuario="sa;";
        String lStrClave = "aemsa152027;";

        String lStrUrl = lStrTipoDriver + lStrServidor + lStrPuerto + " database = " + lStrBaseDatos + "user = " + lStrUsuario + "password = " + lStrClave;
                                              
        try{
            Class.forName(lStrControlador);

            oSQLCxn = DriverManager.getConnection(lStrUrl);
            System.out.println("Conexion realizada .....!");
            
        }catch(ClassNotFoundException ex){
            // Controlador no instalado
            System.out.println("Controlador no instalado .....!"+ex.getMessage());

        }catch(SQLException ex){
            switch ( ex.getErrorCode() ){
                case 0:
                    // Comunicacion no disponible
                    System.out.println("Comunicacion no dispobible .....!, ERROR = " + ex.getErrorCode());
                    break;
                case 1049:
                    // Base de datos no existe
                    System.out.println("Base de Datos no existe .....!, ERROR = " + ex.getErrorCode());
                    break;
            }

        }catch(Exception ex){
            // error en conexion
            System.out.println("Error de Conexion .....!");

            throw new RuntimeException(ex.getLocalizedMessage());
        }
        return oSQLCxn;
        
    }    
    
}
