package br.infnet.leandro.fornecedores.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.leandro.fornecedores.entity.Fornecedor;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Long>{
	
}
