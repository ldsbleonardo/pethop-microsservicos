package br.infnet.leandro.fornecedores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FornecedoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(FornecedoresApplication.class, args);
	}

}
