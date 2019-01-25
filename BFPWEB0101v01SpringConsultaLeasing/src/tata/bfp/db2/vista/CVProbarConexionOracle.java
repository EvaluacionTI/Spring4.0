/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tata.bfp.db2.vista;

import tata.bfp.db2.modelo.CDConexionOracle;

/**
 *
 * @author ALEDIA
 */
public class CVProbarConexionOracle {

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
