package pe.tata.bfp.controlador.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pe.tata.bfp.entidad.filter.CEUsuarioFiltro;

public class CCPostSeguridadFiltro implements Filter {
	private static final Logger moLog = LogManager.getLogger(CCPostSeguridadFiltro.class);

	public CCPostSeguridadFiltro() {
		System.out.println(" Ingreso al PostSeguridadFiltro ----->" + CCPostSeguridadFiltro.class);
	}

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest poRequest, ServletResponse poResponse, FilterChain poFilter)
			throws IOException, ServletException {

		System.out.println(" Ingreso a doFilter ----->" + CCPostSeguridadFiltro.class);
		HttpServletRequest poRQ = (HttpServletRequest) poRequest;
		HttpServletResponse poRS = (HttpServletResponse) poResponse;		
		HttpSession poSS = poRQ.getSession();
		
		System.out.println("Request ----->" + poRQ);
		System.out.println("Response ----->" + poRS);
		System.out.println("Session ----->" + poSS);
 
		String txt_log_acceder = poRQ.getParameter("txt_log_acceder");
		String usuario = poRQ.getRemoteUser();
		
		System.out.println("txt_log_acceder ----->" + txt_log_acceder);
		System.out.println("usuario ----->" + usuario);
		PrintWriter oPW = poRS.getWriter();
		
		oPW.print("Procesansao el filter");
		
		poSS.setAttribute(CEUsuarioFiltro.USUARIO_FILTRO, poRQ.getHeader("Cookie"));
		
		poFilter.doFilter(poRequest, poResponse);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
