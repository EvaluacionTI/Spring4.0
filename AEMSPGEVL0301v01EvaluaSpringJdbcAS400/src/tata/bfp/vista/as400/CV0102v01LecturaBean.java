package tata.bfp.vista.as400;

import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tata.bfp.entidad.as400.CECliente;
import tata.bfp.servicio.as400.CICliente;

public class CV0102v01LecturaBean {

	private static ApplicationContext moRutaXmlContext;
	private static final Logger moLog = LogManager.getLogger(CV0102v01LecturaBean.class);	
	
	public static void main(String[] args) {
		moRutaXmlContext = new ClassPathXmlApplicationContext("spring-modulo-as400.xml");
		
		moLog.info("Lectura Spring-modulo-as400.xml ----->" + moRutaXmlContext + "\n");
		
		System.out.println("LECTURA DE : spring-modulo-as400.xml");
		System.out.println("getApplicationName : " + moRutaXmlContext.getApplicationName());
		System.out.println("getDisplayName : " + moRutaXmlContext.getDisplayName());
		System.out.println("getId : " + moRutaXmlContext.getId());
		System.out.println("getBeanDefinitionCount : " + moRutaXmlContext.getBeanDefinitionCount());
		System.out.println("getStartupDate : " + moRutaXmlContext.getStartupDate());
		System.out.println("getBeanDefinitionNames : " + moRutaXmlContext.getBeanDefinitionNames());
		System.out.println("getClass : " + moRutaXmlContext.getClass());
		System.out.println("getClassLoader : " + moRutaXmlContext.getClassLoader());
		System.out.println("getEnvironment : " + moRutaXmlContext.getEnvironment());
		System.out.println("getParent : " + moRutaXmlContext.getParent());
		System.out.println("getParentBeanFactory : " + moRutaXmlContext.getParentBeanFactory());
		
		System.out.println("getBean - dataSource : " + moRutaXmlContext.getBean("dataSource"));		
		System.out.println("getBean - jdbcTemplate : " + moRutaXmlContext.getBean("jdbcTemplate"));
		System.out.println("getBean - clienteCD : " + moRutaXmlContext.getBean("clienteCD"));
		
		Object moDataSource = moRutaXmlContext.getBean("dataSource");
		System.out.println("moDataSource " + moDataSource.hashCode());
		
		Object moJdbcTemplate = moRutaXmlContext.getBean("jdbcTemplate");
		System.out.println("moJdbcTemplate " + moJdbcTemplate.hashCode());
		
		
		System.out.println("Consulta de datos de un cliente por ID");
		CICliente oCliente = (CICliente) moRutaXmlContext.getBean("clienteCD");
		
		System.out.println("oCliente " + oCliente.buscarClienteporCodigo(101280));
		
		System.out.println("Consulta de lista de Clientes \n");
		List<CECliente> oListaCliente = null;
		oListaCliente = oCliente.listaCliente(); 
		for (int i=1;i<oListaCliente.size();i++){
			System.out.println(oListaCliente.get(i).getIdCodigo() + ' ' + oListaCliente.get(i).getNombre());
		}
		
		System.out.println("Insertar clientes \n");
		try{
			CECliente oCECliente = new CECliente();
			oCECliente.setIdCodigo(1);
			oCECliente.setTipoDocumento("RUC");
			oCECliente.setNumeroDocumento("2051433XX0175");
			oCECliente.setNombre("INVERTEC");
			oCliente.agregarCliente(oCECliente);
		}catch(SQLException ex){
			ex.getSQLState();
		}

		System.out.println("Actualizar clientes \n");
		try{
			CECliente oCECliente = new CECliente();
			oCECliente.setIdCodigo(1);
			oCECliente.setTipoDocumento("RUC");
			oCECliente.setNumeroDocumento("20514330175");
			oCECliente.setNombre("INVERsiones ILI");
			oCliente.actualizarCliente(oCECliente);
		}catch(SQLException ex){
			ex.getSQLState();
		}

		System.out.println("Eliminar clientes \n");
		oCliente.eliminarCliente(1);;
		
	}

}
