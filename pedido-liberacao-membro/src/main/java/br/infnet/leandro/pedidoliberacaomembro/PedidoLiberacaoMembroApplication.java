package br.infnet.leandro.pedidoliberacaomembro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PedidoLiberacaoMembroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidoLiberacaoMembroApplication.class, args);
	}

}
