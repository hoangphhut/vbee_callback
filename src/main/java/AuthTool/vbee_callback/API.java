package AuthTool.vbee_callback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class API {
	 
	@RequestMapping("/vbee/api")
	public void api() {
		System.out.println("Vbee api() is invoking...");

	}	
	
}
