/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tata.bfp.fox.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Descripcion : Diversos tipos de conexión Oracle a partir de 10g
 */
public class CDConexionOracle {

    private Connection moCxn;

    /*
     * Descripcion : Conexión con driver JDBC6 utilizando un nombre de servicio de Oracle
     */
    public Connection conexion10g(){

        String msDriver = "oracle.jdbc.driver.OracleDriver";
        String msServidor = "172.17.15.44";
        String msPuerto = "1521";
        String msServicio = "ORADES";
        //private String msJDBCUrl = "jdbc:oracle:thin:@//172.17.15.44:1521/ORADES";
        String msJDBCUrl = "jdbc:oracle:thin:@//" + msServidor + ":" + msPuerto + "/" + msServicio;
        String msUsuario = "USUALSA";
        String msClave = "ALSA01";
        
        try{
            Class.forName(msDriver);
            System.out.println("Verificando driver .....!" + msDriver );
            
            moCxn = DriverManager.getConnection(msJDBCUrl, msUsuario, msClave);
            if (moCxn != null){
                System.out.println("Conexion Satisfactoria .....! " + moCxn);
            }
        }catch(ClassNotFoundException | SQLException oCNFE){
            oCNFE.printStackTrace();
        }finally{
            try{
                if (moCxn!= null && !moCxn.isClosed()){
                    moCxn.close();
                }
            }catch(SQLException oSQL){
                oSQL.printStackTrace();
            }
        }
        return moCxn;
    }

}
