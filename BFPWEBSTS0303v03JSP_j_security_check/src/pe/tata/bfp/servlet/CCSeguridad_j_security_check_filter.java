package pe.tata.bfp.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class CCSeguridad_j_security_check
 */
@WebServlet("/CCSeguridad_j_security_check")
public class CCSeguridad_j_security_check_filter implements Filter {
	private static final Logger moLog = LogManager.getLogger(CCSeguridad_j_security_check_filter.class);
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CCSeguridad_j_security_check_filter() {
        super();
        // TODO Auto-generated constructor stub
        moLog.info("Ingreso al constructor ----->");
    }


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest oRQ = (HttpServletRequest) arg0;
		HttpServletResponse oRS = (HttpServletResponse) arg1;
		
		oRS.sendRedirect("/portal/index.html");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
