package etg.bbva.evalua.spring.vista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("etg")
public class CV01v01IniciarSpringBoot {

	public static void main(String[] args) {
		SpringApplication oApp = new SpringApplication(CV01v01IniciarSpringBoot.class);
		oApp.run(args);
	}

}
