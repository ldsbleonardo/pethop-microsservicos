package br.infnet.leandro.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GatewayApplication {
	
	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		
		return builder.routes()
				.route(p -> 
				p.path("/fornecedor/**")
				.uri("http://localhost:8282"))
				.route(p -> p
						.path("/pedidosLiberacao/**")
				.filters(f -> f.circuitBreaker(
						config -> config
						.setName("mycmd")
						.setFallbackUri("forward:/fallback")))
				.uri("http://localhost:8181"))
				.build();
	}
	
	@GetMapping("/fallback")
	public String fallback() {
		return "Teste para fallback";
	}
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
