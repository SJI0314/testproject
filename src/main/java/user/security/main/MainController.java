package user.security.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	
	@GetMapping("/approval")
	public void approval() {		
	}
	
	@GetMapping("/boardlist")
	public void boardlist() {	
	}
	
	@GetMapping("/boardwrite")
	public void boardwrite() {
	}
}
