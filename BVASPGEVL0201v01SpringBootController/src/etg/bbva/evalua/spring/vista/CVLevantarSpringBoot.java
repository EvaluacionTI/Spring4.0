package etg.bbva.evalua.spring.vista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CVLevantarSpringBoot {

	public static void main(String[] args) {
		System.out.println("Clase que se encarga de arrancar la aplicación (Escritorio y Web) y su aplication context");
		
		System.out.println("Uso de la anotación : @SpringBootApplication");
		SpringApplication.run(CVLevantarSpringBoot.class, args);
		System.out.println("Digitar url: localhost:8080");
	}

}
