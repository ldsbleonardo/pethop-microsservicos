package br.infnet.leandro.pedidoliberacaomembro.resource;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.leandro.pedidoliberacaomembro.entity.PedidoLiberacaoMembroEntity;
import br.infnet.leandro.pedidoliberacaomembro.service.PedidoLiberacaoMembroService;

@RestController
@RequestMapping("/membros")
public class PedidoLiberacaoMembroResource {
	private static Logger log = org.slf4j.LoggerFactory.getLogger(PedidoLiberacaoMembroResource.class);
	
	@Autowired
	private PedidoLiberacaoMembroService pedidoLiberacaoMembroService;
	
	@GetMapping
	public ResponseEntity<List<PedidoLiberacaoMembroEntity>> getMembros(){
		log.info("Iniciando chamada dos membros de liberação do pedido");
		return ResponseEntity.ok(pedidoLiberacaoMembroService.getAll());
	}
}
