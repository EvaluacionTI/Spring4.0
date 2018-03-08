package tata.bfp.util.fecha;

import java.util.Calendar;

public class CUManejoFecha {
    Calendar moCFechaFinal, moCFechaInicial;
    
    public CUManejoFecha(){
        moCFechaFinal = Calendar.getInstance();
        moCFechaInicial = Calendar.getInstance();
    }

    /*
     * Fecha           : 29/03/2017
     * Descripci�n     : Determinar el n�mero de d�as de dos fechas tipo Calendar que vienen inicializados
     * psFechaInicial  : Fecha Inicial formateado en funci�n de tipo Calendar
     * psFechaFinal    : Fecha Inicial formateado en funci�n de tipo Calendar    
    */    
    public int numeroDias(Calendar psFechaInicial, Calendar psFechaFinal){
        long iNumeroMilisegundos = 0;
        int iNumeroDias = 0;
        
        try{
            System.out.println(psFechaFinal.getTime() + " | " + psFechaInicial.getTime());
//            System.out.println(moSDFormatoFecha.format(moCFechaFinal.getTime()) + " | " + moSDFormatoFecha.format(moCFechaInicial.getTime()));
            
            iNumeroMilisegundos = (psFechaFinal.getTimeInMillis() - psFechaInicial.getTimeInMillis());

//            System.out.println(psFechaFinal.getTimeInMillis() + " | " + psFechaInicial.getTimeInMillis() + " = " + iNumeroMilisegundos);
            iNumeroDias = (int) (iNumeroMilisegundos / (1000L*60L*60L*24L));
        }catch(Exception ex){
            ex.getMessage();
        }
        return iNumeroDias;
    }
    
    public static int numeroMes(int piNumeroMes){
    	return piNumeroMes - 1;
    }
        
}
