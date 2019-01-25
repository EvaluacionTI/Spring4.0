package tata.bfp.leasing.fox.vista.precuota;

import tata.bfp.leasing.logica.CLPreCuota;

public class CV01v01DiaFacturacion {
	
	public static void main(String[] args) {

		int iDiaDesembolso, iMesDesembolso, iAaaaDesembolso;
		
		CLPreCuota oCLDiaFacturacion = new CLPreCuota();
		String sFechaFacturacion, sFechaCorte, sDiaFacturacion, sNumeroDias;

		iDiaDesembolso = 05; 
		iMesDesembolso = 12;
		iAaaaDesembolso = 2016;
		
		sDiaFacturacion = oCLDiaFacturacion.fechaFacturacionPreCuota(1, iDiaDesembolso, iMesDesembolso, iAaaaDesembolso);		
		sFechaFacturacion = oCLDiaFacturacion.fechaFacturacionPreCuota(2, iDiaDesembolso, iMesDesembolso, iAaaaDesembolso);
		sFechaCorte = oCLDiaFacturacion.fechaFacturacionPreCuota(3, iDiaDesembolso, iMesDesembolso, iAaaaDesembolso);
		sNumeroDias = oCLDiaFacturacion.fechaFacturacionPreCuota(4, iDiaDesembolso, iMesDesembolso, iAaaaDesembolso);

		System.out.println("Fecha Primer Desembolso : " + iDiaDesembolso + "/" + iMesDesembolso + "/" + iAaaaDesembolso);
		System.out.println("Día Facturación         : " + sDiaFacturacion);		
        System.out.println("Fecha Facturación       : " + sFechaFacturacion);
        System.out.println("Fecha Corte             : " + sFechaCorte);
        System.out.println("Días FF y F.Desembolso  : " + sNumeroDias);

		
		 
	}

}
