package br.infnet.leandro.liberacaopedido.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.infnet.leandro.liberacaopedido.dto.PedidoLiberacaoMembroDto;

@FeignClient("membro")
public interface PedidoLiberacaoMembroClient {
	
	@GetMapping("/membros")
	ResponseEntity<List<PedidoLiberacaoMembroDto>> getMembros();
}
