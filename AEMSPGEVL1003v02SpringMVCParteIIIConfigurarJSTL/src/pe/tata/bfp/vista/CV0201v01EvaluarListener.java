package pe.tata.bfp.vista;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;

public class CV0201v01EvaluarListener {
	private static Logger logger = LogManager.getLogger(CV0201v01EvaluarListener.class);
	
	public static void main(String[] args) {
		ContextLoaderListener oContext = new ContextLoaderListener();
		logger.info("Context" + oContext);
		System.out.println(ContextLoader.getCurrentWebApplicationContext());
		System.out.println(ContextLoader.CONFIG_LOCATION_PARAM);
		System.out.println(ContextLoader.CONTEXT_ID_PARAM);
	}

}
