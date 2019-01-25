package tata.	bfp.modelo.as400;

import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.orm.hibernate4.HibernateTemplate;
// La version 3 hibernate3 se encuentra desactualizado
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import tata.bfp.entidad.as400.CECliente;
import tata.bfp.servicio.as400.CICliente;

public class CDClienteMapeoHibernate extends HibernateDaoSupport implements CICliente{
	private static final Logger moLog = LogManager.getLogger(CDClienteMapeoHibernate.class);
	@Override
	public void agregarCliente(CECliente poCECliente) throws SQLException {
		// TODO Auto-generated method stub
		HibernateTemplate oHibernateTemplate = getHibernateTemplate();
		if (poCECliente != null){
			List oListado = oHibernateTemplate.find("FROM " + CECliente.class.getName() + " AS Cliente WHERE Cliente.id" + poCECliente.getIdCodigo());
			if (oListado.isEmpty()){
				this.moLog.debug("Hacemos un save");
				oHibernateTemplate.save(poCECliente);
			}
		}
	}

	@Override
	public void actualizarCliente(CECliente poCECliente) throws SQLException {
		// TODO Auto-generated method stub
		HibernateTemplate oHibernateTemplate = getHibernateTemplate();
		if (poCECliente != null){
			List oListado = oHibernateTemplate.find("FROM " + CECliente.class.getName() + " AS Cliente WHERE Cliente.id" + poCECliente.getIdCodigo());
			if (!oListado.isEmpty()){
				this.moLog.debug("Hacemos una actualización");
				//oHibernateTemplate.update(oListado);
			}
			
		}
	}

	@Override
	public CECliente buscarClienteporCodigo(int piIdCodigo) {
		// TODO Auto-generated method stub
		this.moLog.debug("Buscamos el usuario"+ piIdCodigo);
		//return (CECliente)getHibernateTemplate().getClass(CECliente, piIdCodigo);
		return null;
	}

	@Override
	public void eliminarCliente(int piIdCodigo) {
		// TODO Auto-generated method stub
		this.moLog.debug("Borramos el usuario"+ piIdCodigo);
	//	CECliente oCECliente = (CECliente)getHibernateTemplate().load(CECliente.class, piIdCodigo);
	//	getHibernateTemplate().delete(oCECliente);
	}

	@Override
	public List listaCliente() {
		// TODO Auto-generated method stub
		return null;
	}

}
