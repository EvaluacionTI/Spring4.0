package tata.bfp.vista;

import org.springframework.web.context.ContextLoaderListener;

public class CV0201v01EvaluarListener {

	public static void main(String[] args) {
		ContextLoaderListener oContext = new ContextLoaderListener();
				
		System.out.println(oContext.getCurrentWebApplicationContext());
		System.out.println(oContext.CONFIG_LOCATION_PARAM);
		System.out.println(oContext.CONTEXT_ID_PARAM);
	}

}
