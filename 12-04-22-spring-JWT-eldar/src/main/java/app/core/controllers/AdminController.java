package app.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

//	@Autowired
//	private JwtUtil jwtUtil;

	@GetMapping("/greet")
	public String greet(@RequestHeader String token) {
		return "Hello";
//		try {
//			Client client = jwtUtil.extractClient(token);
//			return "Hello " + client.getEmail();
//		} catch (Exception e) {
//			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "you are not logged in");
//		}
	}
	
	@PostMapping("/company/{companyName}")
	public String createCompany(@RequestHeader String token, @PathVariable String companyName) {
		return " company " + companyName + " created";
	}

}
