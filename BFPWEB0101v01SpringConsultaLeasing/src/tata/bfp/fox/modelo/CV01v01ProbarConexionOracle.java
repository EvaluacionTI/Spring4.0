
package tata.bfp.fox.modelo;

import tata.bfp.fox.modelo.CDConexionOracle;

public class CV01v01ProbarConexionOracle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CDConexionOracle oCxn = new CDConexionOracle();
        
        try{
            System.out.println("Conexion = " + oCxn.conexion10g());
        }catch(Exception oEx){
            System.out.println("Error en Conexion = " + oEx.getMessage());
        }
        
        
    }
    
}
