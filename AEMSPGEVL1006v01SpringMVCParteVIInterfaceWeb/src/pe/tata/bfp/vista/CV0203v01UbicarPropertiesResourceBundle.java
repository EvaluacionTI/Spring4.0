package pe.tata.bfp.vista;

import java.util.ResourceBundle;

public class CV0203v01UbicarPropertiesResourceBundle {
	public static void main(String[] args) {
		// Este busca en una clase en particular y se referencia con el nombre del paquete + nombre del archivo de propiedades
		String ARCHIVO_CONFIGURACION = "pe.tata.bfp.propiedad.mesaje_es_EN";
		
		ResourceBundle oRB = ResourceBundle.getBundle(ARCHIVO_CONFIGURACION);
		try {
			System.out.println("Titulo = "+oRB.getString("msgTitulo"));
			System.out.println("Cabecera Fecha = "+oRB.getString("msgCabeceraFecha"));
			System.out.println("Cabecera Listado = "+oRB.getString("msgCabeceraListado"));
			
		}catch(Exception ex) {
			ex.getMessage();
		}
	}
	
}
