package br.infnet.leandro.pedidoliberacaomembro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.leandro.pedidoliberacaomembro.entity.PedidoLiberacaoMembroEntity;

@Repository
public interface PedidoLiberacaoMembroRepository extends CrudRepository<PedidoLiberacaoMembroEntity, Long>{

}
