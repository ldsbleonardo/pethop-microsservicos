package br.infnet.leandro.fornecedores.resource;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.leandro.fornecedores.entity.Fornecedor;
import br.infnet.leandro.fornecedores.services.FornecedorService;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorResource {
	private static Logger log = org.slf4j.LoggerFactory.getLogger(FornecedorResource.class);
	@Autowired
	private FornecedorService fornecedorService;
	
	@GetMapping("/{idForn}")
	public Fornecedor getFornecedor(@PathVariable Long idForn) {
		log.info("Iniciando busca de fornecedor pelo código");
		
		return fornecedorService.getByCodigo(idForn);
	}
}
