
package tata.bfp.fox.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class CDConsultaLeasing {
    
    private Connection moSQLCxn = null; //se declara una variable Connection
    private CallableStatement moCS = null;
    
    public String consultaContratoEquivalencia(){
        CDConexionOracle oCDConexionOracle = new CDConexionOracle();
        String lsComandoSQL = "{? = CALL AD_CONSULTAS.AD_CONTRATOS_EQUIVALENCIA(?, ?)}";
        
        
        try{
            moSQLCxn = oCDConexionOracle.conexion10g();
            moCS = moSQLCxn.prepareCall(lsComandoSQL);
            
            moCS.setString("C_FECHA", "15/09/2016");
            /*
            Esta relacionado con el procedimiento que tiene una salida tipo SYS_REFCURSOR
            */
           // moCS.registerOutParameter("C_SALIDA", OracleTypes.CURSOR);
            moCS.execute();//Ejecución del procedimiento
            
            moSQLCxn.close();
            
        }catch(SQLException oSQLE){
            oSQLE.getErrorCode();
        }
        catch(Exception oEx){
            oEx.getMessage();
        }
        return "";
    }
}


