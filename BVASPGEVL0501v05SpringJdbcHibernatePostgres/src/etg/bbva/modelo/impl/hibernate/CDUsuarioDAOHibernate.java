package etg.bbva.modelo.impl.hibernate;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import etg.bbva.entidad.CE01Usuario;
import etg.bbva.modelo.CIUsuarioDAO;

public class CDUsuarioDAOHibernate extends HibernateDaoSupport implements CIUsuarioDAO{
	private static final Logger moLog = LogManager.getLogger(CDUsuarioDAOHibernate.class);

	@Override
	public void saveUsuario(CE01Usuario poCEUsuario) {
		moLog.info("Guardamos el usuario con Hibernate" + poCEUsuario);
		HibernateTemplate oHBTemplate = getHibernateTemplate();

		if(poCEUsuario != null) {
			String sSQLComando = "FROM " + CE01Usuario.class.getName() + "AS DESt01_usuario WHERE id_usuario = " + poCEUsuario.getId();
			List oListUsuario = oHBTemplate.find(sSQLComando);
			if (oListUsuario.isEmpty()) {
				moLog.info("Grabamos la información : " + poCEUsuario);
				oHBTemplate.save(poCEUsuario);
			}else {
				moLog.info("Actualizamos la información : " + poCEUsuario);
				oHBTemplate.update(poCEUsuario);
			}
		}		
	}

	@Override
	public CE01Usuario findUsuario(Integer pId) {
		moLog.info("Buscamos el usuario  : " + pId);
		return getHibernateTemplate().get(CE01Usuario.class, pId);
	}

	@Override
	public void deleteUsuario(Integer pId) {
		moLog.info("Borramos el usuario  : " + pId);
		CE01Usuario oCEUsuarioEliminar = getHibernateTemplate().load(CE01Usuario.class, pId);
		getHibernateTemplate().delete(oCEUsuarioEliminar);		
	}

	@Override
	public List<CE01Usuario> listAll() {
		moLog.info("Listamos los usuarios  : ");
		HibernateTemplate oHBTemplate = getHibernateTemplate();
		
		String sSQLComando = "FROM " + CE01Usuario.class.getName() + "AS DESt01_usuario";
		
		List<CE01Usuario> oListUsuario = (List<CE01Usuario>) oHBTemplate.find(sSQLComando);
		return oListUsuario;
	}
	
}
