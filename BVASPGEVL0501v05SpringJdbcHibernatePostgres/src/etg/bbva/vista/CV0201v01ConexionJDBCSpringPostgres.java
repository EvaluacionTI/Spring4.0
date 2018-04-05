package etg.bbva.vista;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etg.bbva.entidad.CE01Usuario;
import etg.bbva.modelo.CIUsuarioDAO;

public class CV0201v01ConexionJDBCSpringPostgres {
	private static ApplicationContext moRutaXmlContext;
	private static final Logger moLog = LogManager.getLogger(CV0201v01ConexionJDBCSpringPostgres.class);
	
	public static void main(String[] args) {
		moRutaXmlContext = new ClassPathXmlApplicationContext("springConfig.xml");
		moLog.info("-----> Lectura configuración xml : " + moRutaXmlContext + "\n");
		
		moLog.info("-----> dataSource : " + moRutaXmlContext.getBean("idDataSourcePostgres"));		
		moLog.info("-----> jdbcTemplate : " + moRutaXmlContext.getBean("idJdbcTemplate"));
		
		moLog.info("-----> A. Consulta de datos de un Usuario por ID");
		CIUsuarioDAO oCIUsuario = (CIUsuarioDAO) moRutaXmlContext.getBean("idCDUsuario");
		moLog.info("-----> Usuario(5) : " + oCIUsuario.findUsuario(5).getNombre());

		moLog.info("-----> B. Lista de datos de usuarios");

		List<CE01Usuario> oListaUsuario = null;
		oListaUsuario = oCIUsuario.listAll(); 
		for (int i=0;i<oListaUsuario.size();i++){
			moLog.info(oListaUsuario.get(i).getId() + ' ' + oListaUsuario.get(i).getNombre());
		}
	}

}
