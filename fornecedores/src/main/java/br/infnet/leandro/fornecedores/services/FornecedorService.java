package br.infnet.leandro.fornecedores.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.leandro.fornecedores.entity.Fornecedor;
import br.infnet.leandro.fornecedores.repository.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	public Fornecedor getByCodigo(Long idFornecedor) {
		return fornecedorRepository.findById(idFornecedor).get();
	}
	
}
