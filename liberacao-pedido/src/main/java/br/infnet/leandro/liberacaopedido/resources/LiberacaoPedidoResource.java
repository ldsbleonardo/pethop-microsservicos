package br.infnet.leandro.liberacaopedido.resources;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.infnet.leandro.liberacaopedido.clients.PedidoLiberacaoMembroClient;
import br.infnet.leandro.liberacaopedido.dto.FornecedorDto;
import br.infnet.leandro.liberacaopedido.dto.PedidoLiberacaoDto;
import br.infnet.leandro.liberacaopedido.dto.PedidoLiberacaoMembroDto;
import br.infnet.leandro.liberacaopedido.dto.PedidoLiberacaoResponseDto;
import org.slf4j.*;

@RestController
@RequestMapping("/pedidosLiberacao")
public class LiberacaoPedidoResource {
	
	private static Logger log = org.slf4j.LoggerFactory.getLogger(LiberacaoPedidoResource.class);
			
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${fornecedor.api.url}")
	private String fornecedorApiUrl;
	
	@Autowired
	private PedidoLiberacaoMembroClient pedidoLiberacaoMembroClient;
	
	@PostMapping
	public PedidoLiberacaoResponseDto efetuaPedidoLiberacao(@RequestBody PedidoLiberacaoDto pedidoLiberacaoDto) {
		FornecedorDto fornecedorDto = restTemplate.getForObject(fornecedorApiUrl
	+pedidoLiberacaoDto.getIdFornecedor(), FornecedorDto.class);
		
		log.info("Iniciando solicitação de crédito para Pedido de Liberação");
		
		ResponseEntity<List<PedidoLiberacaoMembroDto>> membros = pedidoLiberacaoMembroClient.getMembros();
		
		System.out.println(pedidoLiberacaoDto);
		System.out.println(fornecedorDto);
		System.out.println(membros);
		
		log.info("Pedido efetuado: {}", pedidoLiberacaoDto.getId()+ " do fornecedor {}", fornecedorDto.getNome());
		
		return new PedidoLiberacaoResponseDto(fornecedorDto, membros.getBody());
	}
	
	
}
