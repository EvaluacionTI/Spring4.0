package etg.bbva.evalua.spring.vista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CV0101v01IniciarSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("1. Para iniciar @SpringBootApplication - Modo Escritorio");
		System.out.println("Configurar POM con : spring-boot-starter");
		
		System.out.println("2. Para iniciar @SpringBootApplication - Modo Web");
		System.out.println("Configurar POM con : spring-boot-starter-web");
		
		System.out.println("3. Para iniciar @SpringBootApplication - Modo Test");
		System.out.println("Configurar POM con : spring-boot-starter-test");
		
		SpringApplication app = new SpringApplication(CV0101v01IniciarSpringBootApplication.class);
		app.run(args);
		System.out.println("4. Digitar url: localhost:8080");
		

	}

}
