package tata.bfp.db2.modelo;


import java.util.ArrayList;

import pe.tata.bfp.db2.entidad.CETramaOperacionIBS;


public class CDTramaOperacionIBS {
    
    String SQL_OPERACION = "SELECT 			TD.DEABNK AS Banco, TD.DEABRN AS Agencia, TD.DEATYP AS CodigoTipoProducto," + 
				"(SELECT		TBL.CNODSC" + 
				"	FROM	BFPCYFILES.CNOFC	TBL" + 
				"	WHERE	TBL.CNOCFL = '04'	AND" + 
				"			TBL.CNORCD = TD.DEATYP" + 
				") AS TipoProducto," + 
				"TD.DEAPRO AS CodigoProducto," + 
				"RIGHT('0000' || TRIM(CHAR(TD.DEAACC)),12) AS NroCuenta, TC.CUSIDN AS Identificacion, TC.CUSNA1 AS Cliente, TC.CUSNA2 AS Direccion," + 
				"TD.DEASPR AS Tasa, TD.DEACCY AS Moneda, TD.DEAMEP AS SaldoCapital, TD.DEAMEI AS Interes, TD.DEAOAM AS SaldoApertura," + 
				"(RIGHT('0' || TRIM(CHAR(TD.DEASDD)),2) || '/' || RIGHT('0' || TRIM(CHAR(TD.DEASDM)),2) || '/' ||" + 
				" CHAR(TD.DEASDY)" + 
				") AS FechaAperturaContrato,	" + 
				"(RIGHT('0' || TRIM(CHAR(TD.DEAMAD)),2) || '/' || RIGHT('0' || TRIM(CHAR(TD.DEAMAM)),2) || '/' ||" + 
				" CHAR(TD.DEAMAY)" + 
				") AS FechaVencimientoContrato,	" + 
				"TD.DEAREF AS ReferenciaFWL," + 
				"TD.DEACUN AS CodigoClienteIBS, TRG.MG4GRA AS NoContratoFOX, TRG.MG4CCF AS NoContratoIBS, TRG.MG4GRF AS NoGarantiaIBS," + 
				"TG.ROCTYP AS CodigoTipoGarantia," + 
				"(SELECT		TBL.BFTDLA" + 
				"	FROM	BFPCYFILES.BFTAB	TBL" + 
				"	WHERE	TBL.BFTTAB = 946	AND" + 
				"			TBL.BFTCOD = TG.ROCTYP" + 
				") AS TipoGarantia," + 
				"TG.ROCDES || ' ' || TRIM(TG.ROCSP5) AS DescripcionGarantia , TG.ROCLOC AS DireccionGarantia," + 
				"TG.ROCBRN AS CodigoSucursal," + 
				"TG.ROCGLN AS CuentaContable," + 
				"TG.ROCOFX AS TipoCambio," + 
				"TG.ROCCCY AS Moneda, " + 
				"TG.ROCFAA AS ImporteGarantia," + 
				"TG.ROCAPA AS SaldoDisponible," + 
				"TL.ROEVCO AS ValorComercial," + 
				"TG.ROCPPU AS ValoRealizacionInmediata," + 
				"TG.ROCAM2 AS ValorTerreno," + 
				"TL.ROEMED AS ValorEdificacion," + 
				"COALESCE(TS.RSEVAL,0) AS SumAsegurada, " + 
				"TG.ROCABY AS Valuador," + 
				"(RIGHT('0' || TRIM(CHAR(TL.ROEDAD)),2) || '/' || RIGHT('0' || TRIM(CHAR(TL.ROEDAM)),2) || '/' ||" + 
				" CHAR(TL.ROEDAA)" + 
				") AS FechaDepositoAduanero," + 
				"(RIGHT('0' || TRIM(CHAR(TG.ROCAPD)),2) || '/' || RIGHT('0' || TRIM(CHAR(TG.ROCAPM)),2) || '/' ||" + 
				" CHAR(TG.ROCAPY)" + 
				") AS FechaValuacion," + 
				"(RIGHT('0' || TRIM(CHAR(TG.ROCOPD)),2) || '/' || RIGHT('0' || TRIM(CHAR(TG.ROCOPM)),2) || '/' ||" + 
				" CHAR(TG.ROCOPY)" + 
				") AS FechaApertura," + 
				"(RIGHT('0' || TRIM(CHAR(TG.ROCRED)),2) || '/' || RIGHT('0' || TRIM(CHAR(TG.ROCREM)),2) || '/' ||" + 
				" CHAR(TG.ROCREY)" + 
				") AS FechaVencimiento," + 
				"(RIGHT('0' || TRIM(CHAR(TG.ROCMTD)),2) || '/' || RIGHT('0' || TRIM(CHAR(TG.ROCMTM)),2) || '/' ||" + 
				" CHAR(TG.ROCMTY)" + 
				")  AS FechaRenovacion," + 
				"(RIGHT('0' || TRIM(CHAR(TL.ROEFPD)),2) || '/' || RIGHT('0' || TRIM(CHAR(TL.ROEFPM)),2) || '/' ||" + 
				" CHAR(TL.ROEFPA)" + 
				") AS FechaProtesto," + 
				"(RIGHT('0' || TRIM(CHAR(TL.ROEFED)),2) || '/' || RIGHT('0' || TRIM(CHAR(TL.ROEFEM)),2) || '/' ||" + 
				" CHAR(TL.ROEFEA)" + 
				") AS FechaEjecucion," + 
				"(RIGHT('0' || TRIM(CHAR(TL.ROEFLD)),2) || '/' || RIGHT('0' || TRIM(CHAR(TL.ROEFLM)),2) || '/' ||" + 
				" CHAR(TL.ROEFLA)" + 
				") AS FechaLevantamiento," + 
				"(CASE WHEN TG.ROCINF = 'Y' THEN 'SI'" + 
				"      ELSE 'NO'" + 
				" END" + 
				") AS ConPolizaSeguro," + 
				"(CASE WHEN TL.ROESIT = 'A' THEN 'VIGENTE'" + 
				" 	  WHEN TL.ROESIT = 'C' THEN 'CANCELADO'" + 
				" 	  WHEN TL.ROESIT = 'P' THEN 'PENDIENTE'" + 
				" 	  WHEN TL.ROESIT = 'T' THEN 'PROTESTADO'" + 
				" 	  WHEN TL.ROESIT = 'V' THEN 'VENCIDO'" + 
				" 	  ELSE 'NO DEFINIDO'" + 
				" END" + 
				") AS SituacionGarantia," + 
				"TG.ROCOFI AS CodigoFuncionario," + 
				"(SELECT			TF.CNODSC" + 
				"	FROM		BFPCYFILES.CNOFC	TF" + 
				"	WHERE		TF.CNOCFL	=	'15'	AND" + 
				"				TF.CNORCD	=	TG.ROCOFI" + 
				") AS FuncionarioPrincipal," + 
				"TG.ROCOF2 AS CodigoFuncionarioAlterno," + 
				"(SELECT			TF.CNODSC" + 
				"	FROM		BFPCYFILES.CNOFC	TF" + 
				"	WHERE		TF.CNOCFL	=	'15'	AND" + 
				"				TF.CNORCD	=	TG.ROCOF2" + 
				") AS FuncionarioAlterno," + 
				"(CASE TRG.MG4COB" + 
				"	WHEN 'E' THEN 'ESPECIFICA'" + 
				"	WHEN 'G' THEN 'GENERAL'" + 
				"	ELSE 'NO DEFINIDO'" + 
				" END) AS ClaseGarantia," + 
				"SUBSTRING(TRIM(CHAR(TG.ROCAM1)), 1,  LENGTH(TRIM(CHAR(TG.ROCAM1))) - 3) AS WarCfzStb," + 
				"TS.RSEIDS AS CodigoBroker," + 
				"(SELECT 		TBL.BFTDLA" + 
				"	FROM 		BFPCYFILES.BFTAB   TBL " + 
				"	WHERE 		TBL.BFTTAB= '421'	AND" + 
				"				TBL.BFTCOD = TS.RSEIDS" + 
				") AS Broker," + 
				"TS.RSECOS AS CodigoCompaniaSeguro, " + 
				"(SELECT 		TBL.CNODSC" + 
				"	FROM 		BFPCYFILES.CNOFC TBL " + 
				"	WHERE 		TBL.CNOCFL='CS'	AND" + 
				"				TBL.CNORCD = TS.RSECOS" + 
				") AS CompaniaSeguro," + 
				"TG.ROCTYP AS CodigoTipoGarantiaBFP," + 
				"(SELECT		TBL.BFTDLA" + 
				"	FROM	BFPCYFILES.BFTAB	TBL" + 
				"	WHERE	TBL.BFTTAB = 946	AND" + 
				"			TBL.BFTCOD = TG.ROCTYP" + 
				") AS TipoGarantia," + 
				"TG.ROCDES AS BienBFP," + 
				"TS.RSETBI AS CodigoTipoGarantiaSeguro," + 
				"TS.RSETIP AS BienSeguro," + 
				"TS.RSEDET AS DetalleBien," + 
				"TS.RSEPOL AS NoPoliza, TS.RSEDES AS FechaInicioPoliza, TS.RSEHAS AS FechaVencimientoPoliza," + 
				"(CASE TS.RSESIT" + 
				"	WHEN 1 THEN 'GARANTIA ASEGURADA'" + 
				"	WHEN 2 THEN 'GARANTIA SIN SEGURO'" + 
				"	ELSE 'NO DEFINIDO'" + 
				" END" + 
				") AS TipoSituacionPoliza," + 
				"(CASE TS.RSETIA" + 
				"	WHEN 1 THEN 'SIN RESPONSABILIDAD'" + 
				"	WHEN 2 THEN 'SEGURO DE TERCEROS'" + 
				"	WHEN 3 THEN 'SEGURO BANCO'" + 
				"	ELSE 'NO DEFINIDO'" + 
				" END" + 
				") AS TipoAplicacion," + 
				"TS.RSEOBS AS Observacion" + 

                "FROM 		BFPCYFILES.AFGM14T   TRG" + 
                "RIGHT JOIN	BFPCYFILES.DEALS TD" + 
                "		ON	(TRG.MG4CCF = TD.DEAACC)" + 
                "INNER JOIN	BFPCYFILES.CUMST 	 TC" + 
                "		ON	(TD.DEACUN	= TC.CUSCUN)" + 
                "LEFT JOIN	BFPCYFILES.ROCOL 	 TG" + 
                "		ON	(TRG.MG4GRF  = TG.ROCREF)" + 
                "LEFT JOIN	BFPCYFILES.ROCOLEX TL" + 
                " 		ON	(TG.ROCREF	= TL.ROEREF)" + 
                "LEFT JOIN	BFPCYFILES.ROCSEG 	 TS" + 
                "		ON	(TG.ROCREF	= TS.RSEREF)" + 

                "WHERE		TD.DEATYP IN ('LSG', 'LSGR')" + 
                "	AND		TD.DEASTS = ''";
    
    
    
    public void consultaOperacionIBS(String pTipoConsulta){
        
    }
    
    public ArrayList<CETramaOperacionIBS> retornaTrama(){
        ArrayList<CETramaOperacionIBS> oaTramaOperacion = new ArrayList<>();
        
        try{
            
        }catch(Exception ex){
            
        }
        return oaTramaOperacion;
    }
}
