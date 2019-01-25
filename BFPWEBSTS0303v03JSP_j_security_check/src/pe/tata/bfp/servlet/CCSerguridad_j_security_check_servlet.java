package pe.tata.bfp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/CCSerguridad_j_security_check_servlet")
public class CCSerguridad_j_security_check_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger moLog = LogManager.getLogger(CCSerguridad_j_security_check_servlet.class);       

	public CCSerguridad_j_security_check_servlet() {
        super();
        moLog.info("Ingreso a la clase " + CCSerguridad_j_security_check_servlet.class);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().println("<br>");
		response.getWriter().println("Success - Acceso a la aplicación BPM");
	}

}
