package pe.tata.bfp.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.codec.binary.Base64;

@WebServlet("/CCSeguridad_basic")
public class CCSeguridad_basic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CCSeguridad_basic() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter outDom = response.getWriter();
		outDom.println("Este es un test del Servlet j_security_basic");
		
		Enumeration oHeader = request.getHeaderNames();
		String sNombreHeader, sValorHeader;
		while (oHeader.hasMoreElements()){
			sNombreHeader = (String) oHeader.nextElement();
			sValorHeader = request.getHeader(sNombreHeader);
			outDom.print("<br/> Header Name : <em> " + sNombreHeader);
			outDom.print("</em/>, Header value : <em> " + sValorHeader);
			outDom.println("</em>");
		}
		outDom.println("<hr/>");		
		String authHeader = request.getHeader("authorization");
		String encodedValue = authHeader.split(" ")[1];
		byte[] decodedValue = Base64.decodeBase64(encodedValue);
		outDom.println("Base64-encoded Authorization Value: <em>" + encodedValue);

		outDom.println("</em><br/>Base64-decoded Authorization Value: <em>" + decodedValue);
		outDom.println("</em>");		
	}

}



