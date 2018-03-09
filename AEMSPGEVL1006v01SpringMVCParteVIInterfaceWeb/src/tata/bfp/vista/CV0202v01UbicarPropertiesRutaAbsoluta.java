package tata.bfp.vista;

import java.io.FileReader;
import java.util.Properties;

public class CV0202v01UbicarPropertiesRutaAbsoluta {
	public static void main(String[] args) {
		Properties oPropiedad = new Properties();
		try {
			
			oPropiedad.load(new FileReader("F:\\2018\\03Tecnologia\\10Spring4.3.8\\03Desarrollo\\AEMSPGEVL1006v01SpringMVCParteVIInterfaceWeb\\WebContent\\WEB-INF\\properties\\messages_ES.properties"));
			
			System.out.println("Titulo = "+oPropiedad.getProperty("msgTitulo"));
			System.out.println("Cabecera Fecha = "+oPropiedad.getProperty("msgCabeceraFecha"));
			System.out.println("Cabecera Listado = "+oPropiedad.getProperty("msgCabeceraListado"));
			
		}catch(Exception ex) {
			System.out.print(ex.getMessage());
		}
	}
	
}
