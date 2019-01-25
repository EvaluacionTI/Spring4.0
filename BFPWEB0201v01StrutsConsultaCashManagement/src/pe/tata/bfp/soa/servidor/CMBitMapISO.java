package pe.tata.bfp.soa.servidor;

public class CMBitMapISO implements CIBitMapISO{

	@Override
	public String getSaludoBitMap(String psNombre){
		return "Trama " + psNombre + " consulta servicio Claro";
	}
}
