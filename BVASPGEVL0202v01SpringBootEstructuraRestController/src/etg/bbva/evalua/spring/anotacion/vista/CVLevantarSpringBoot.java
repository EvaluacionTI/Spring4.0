package etg.bbva.evalua.spring.anotacion.vista;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("etg")
public class CVLevantarSpringBoot {

	public static void main(String[] args) {
		System.out.println("Clase que se encarga de arrancar la aplicaci�n y su aplication context");
		
		SpringApplication oSAp = new SpringApplication(CVLevantarSpringBoot.class);
		System.out.println("Personalizar la aplicación");		
		oSAp.setBannerMode(Banner.Mode.OFF);
		oSAp.run(args);

		System.out.println("4. Digitar url: localhost:8080");

	}

}
