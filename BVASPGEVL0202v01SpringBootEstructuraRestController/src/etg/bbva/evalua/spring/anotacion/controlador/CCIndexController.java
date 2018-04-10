package etg.bbva.evalua.spring.anotacion.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CCIndexController {
	
	@RequestMapping("/")
	public String index() {
		return "index - Para iniciar la página con el @RequestMappint y @RestController";
	}
}
