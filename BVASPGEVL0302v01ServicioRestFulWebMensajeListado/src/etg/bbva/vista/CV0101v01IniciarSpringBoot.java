package etg.bbva.vista;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("etg")
public class CV0101v01IniciarSpringBoot {
	
	private static Logger moLog = LogManager.getLogger(CV0101v01IniciarSpringBoot.class);
	
	public static void main(String[] args) {
		SpringApplication oWebApl = new SpringApplication(CV0101v01IniciarSpringBoot.class);
		
		moLog.info("=====> 1. Para iniciar @SpringBootApplication");
		oWebApl.run(args);
		// El puerto se ha configurado en application.properties
		
		moLog.info("=====> 4. http://localhost:8005/");
		moLog.info("=====> 5. http://localhost:8005/mostrarMensaje");
		
		moLog.info("=====> " + oWebApl.getSources());

	}

}
