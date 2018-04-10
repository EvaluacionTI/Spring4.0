package etg.bbva.evalua.spring.restful.controladora;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CCSaludo {
	
	@RequestMapping("/hello")
	public String mostrarSaludo(Model poModel) {
		poModel.addAttribute("saludo", "PAAS : Arquitectura Host");
		return "hello";
	}
}
