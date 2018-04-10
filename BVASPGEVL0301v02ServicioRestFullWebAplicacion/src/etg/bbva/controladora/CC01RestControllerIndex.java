package etg.bbva.controladora;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CC01RestControllerIndex {
	private static Logger moLog = LogManager.getLogger(CC01RestControllerIndex.class);
	
	@RequestMapping("/")
	public String indexPage() {
		moLog.info("=====> Controlador : /");
		
		return "index";
	}
}
