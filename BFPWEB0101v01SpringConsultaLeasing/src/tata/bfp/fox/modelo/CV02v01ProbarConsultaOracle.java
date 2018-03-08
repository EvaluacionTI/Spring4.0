
package tata.bfp.fox.modelo;

import tata.bfp.fox.modelo.CDConsultaLeasing;

public class CV02v01ProbarConsultaOracle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CDConsultaLeasing oCDConsultaFox = new CDConsultaLeasing();
        
        System.out.println("Procesando ---" + oCDConsultaFox.consultaContratoEquivalencia());
        
    }
    
}
