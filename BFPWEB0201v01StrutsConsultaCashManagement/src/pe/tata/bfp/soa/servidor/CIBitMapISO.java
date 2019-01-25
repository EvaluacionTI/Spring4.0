package pe.tata.bfp.soa.servidor;

import java.rmi.Remote;

public interface CIBitMapISO extends Remote{
	public String getSaludoBitMap(String psNombre);
}
