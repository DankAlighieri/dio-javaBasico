package dio.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // responsavel por designar o bean component c suporte a req http REST
public class WelcomeController {

	@GetMapping // determina metodo d req http GET
	public String welcome() {
		return "Welcome to My Spring Boot Web API";
	}
}
