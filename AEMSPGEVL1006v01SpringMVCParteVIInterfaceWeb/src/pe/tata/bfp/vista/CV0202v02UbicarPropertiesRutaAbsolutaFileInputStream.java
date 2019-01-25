package pe.tata.bfp.vista;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class CV0202v02UbicarPropertiesRutaAbsolutaFileInputStream {

	public static void main(String[] args) {
		String sRuta = "F:\\2018\\03Tecnologia\\10Spring4.3.8\\03Desarrollo\\AEMSPGEVL1006v01SpringMVCParteVIInterfaceWeb\\src";
		Properties oPropiedad = new Properties();
		InputStream oISFile;
		
		try {
			oISFile= new FileInputStream(sRuta + "\\mesaje_es_ES.properties");
			oPropiedad.load(oISFile);
			
			System.out.println("Titulo = "+oPropiedad.getProperty("msgTitulo"));
			System.out.println("Cabecera Fecha = "+oPropiedad.getProperty("msgCabeceraFecha"));
			System.out.println("Cabecera Listado = "+oPropiedad.getProperty("msgCabeceraListado"));
			
		}catch(Exception ex) {
			ex.getMessage();
		}
	}
	
}
