package tata.bfp.vista;

import org.springframework.web.servlet.DispatcherServlet;
public class CV0101v01EvaluarDispatcher {

	public static void main(String[] args) {

		DispatcherServlet oServletSpring = new DispatcherServlet();
		
		try{
			System.out.println(oServletSpring.getServletName());	
		}catch(Exception ex){
			ex.getMessage();
		}
		
	}

}
