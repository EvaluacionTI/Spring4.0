package pe.tata.bfp.controlador.filter;

import java.io.IOException;
import java.io.ObjectStreamClass;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/CCSeguridad_filtro")
public class CCSeguridadFiltro implements Filter {
	private static final Logger moLog = LogManager.getLogger(CCSeguridadFiltro.class);
	private static String USUARIO_STS;
	private static String CLAVE_STS;
	public static String USUARIO_SIN_ROL_BPM;
	public static int MAX_REGISTROS_CONSULTA_USUARIOS;
	
    public CCSeguridadFiltro() {
    	try{
    		ResourceBundle propiedadesNexo = ResourceBundle.getBundle("nexo");
    		USUARIO_SIN_ROL_BPM = "'"+propiedadesNexo.getString("usuarioSinRolBPM")+"'";
    		MAX_REGISTROS_CONSULTA_USUARIOS = Integer.parseInt(propiedadesNexo.getString("cantidadUsuariosLDAPConsulta"));
    		USUARIO_STS = propiedadesNexo.getString("tiv.user");
    		CLAVE_STS = propiedadesNexo.getString("tiv.pass");
    		
    		String enlace = propiedadesNexo.getString("ejb.nexo.seguridad.remoto");
    		Context oCntx = new InitialContext();
    		// oCntx.lookup(enlace)
    		
    		System.out.println(" 1. Ingreso al constructor de CCSeguridadFiltro");
    		// Buscar un objeto
    		// get the name for Integers
    		
    		ObjectStreamClass osc = ObjectStreamClass.lookup(Integer.class);
    		
    		System.out.println(" ObjectStreamClass" + osc.getName());
    		
    		System.out.println(" Propiedades  ---->" + propiedadesNexo);
    		System.out.println(" USUARIO_SIN_ROL_BPM ---->" + USUARIO_SIN_ROL_BPM);
    		System.out.println(" MAX_REGISTROS_CONSULTA_USUARIOS ---->" + MAX_REGISTROS_CONSULTA_USUARIOS);
    		System.out.println(" USUARIO_STS ---->" + USUARIO_STS);
    		System.out.println(" CLAVE_STS ---->" + CLAVE_STS);
    		
    		System.out.println(" Enlace ---->" + enlace);
    		System.out.println(" Context  ---->" + oCntx);
    		System.out.println(" Nombre del Context ---->" + oCntx.getEnvironment());

    	}catch(Exception ex){
    		moLog.error(ex.getMessage(),ex);
    	}
    }

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest pRequest, ServletResponse pResponse, FilterChain pFilter)
			throws IOException, ServletException {
		HttpServletRequest oRQ = (HttpServletRequest) pRequest;
		HttpServletResponse oRS = (HttpServletResponse) pResponse;
		//HttpSession oSesion = oRQ.getSession(false);
		HttpSession oSesion = oRQ.getSession(false);
		
		try{
			Context oCntx = new InitialContext();
			moLog.info(" Contex ----->" + oCntx);
			System.out.println(" 2. Ingreso al constructor de CCSeguridadFiltro - doFilter");
			moLog.info(" Sesion ----->" + oSesion.getServletContext());
			moLog.info(" ServletContext ----->" + oSesion.getServletContext());
			String mUsuario = oRQ.getParameter("j_username");
			String mClave = oRQ.getParameter("j_password");
			
			moLog.info("Context Path ----->" + oRQ.getContextPath());
			moLog.info("Usuario ingresado ----->" + mUsuario + "  "  + mUsuario);
			moLog.info("Clave ingresado ----->" + mUsuario + "  "  + mClave);
			moLog.info(" Remoto Host ----->" + oRQ.getRemoteHost());
			moLog.info(" Remoto Addr ----->" + oRQ.getRemoteAddr());
			moLog.info(" Remoto Remote User ----->" + oRQ.getRemoteUser());
			moLog.info(" Remoto User in Role ----->" + oRQ.isUserInRole("usuarioJSP"));
			moLog.info(" Remoto User Principal ----->" + oRQ.getUserPrincipal());
			moLog.info(" Remoto Session Id ----->" + oRQ.getRequestedSessionId());
			moLog.info(" Remoto URI ----->" + oRQ.getRequestURI());
			moLog.info(" Remoto Port ----->" + oRQ.getRemotePort());
			moLog.info(" Remoto Reader ----->" + oRQ.getReader());
			moLog.info(" Remoto Reader ----->" + oRQ.getHeaderNames());
			moLog.info(" Remoto URL ----->" + oRQ.getRequestURL());
			moLog.info(" Remoto Path ----->" + oRQ.getPathTranslated());
			String lsPortal = "/portal/jsp0203v01OkFORM_j_security_checkJSP.jsp";
			moLog.info("Portal ----->" + lsPortal);
			if (oRQ.getRemoteUser()!=null){
				oRS.sendRedirect(oRQ.getContextPath()+lsPortal);
			}else{
				pFilter.doFilter(pRequest, pResponse);
			}
			
			//moLog.info("Before Request ----->" + pRequest.getLocalName());
			//moLog.info("Before Response ----->" + pResponse.getBufferSize());
						
		}catch(Exception ex){
			moLog.info(" Exception ----->" + ex);
		}
		
		



	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}


}
