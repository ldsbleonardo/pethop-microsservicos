package br.infnet.leandro.pedidoliberacaomembro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.leandro.pedidoliberacaomembro.entity.PedidoLiberacaoMembroEntity;
import br.infnet.leandro.pedidoliberacaomembro.repository.PedidoLiberacaoMembroRepository;

@Service
public class PedidoLiberacaoMembroService {
	
	@Autowired
	private PedidoLiberacaoMembroRepository pedidoLiberacaoMembroRepository;
	
	public List<PedidoLiberacaoMembroEntity> getAll(){
		return (List<PedidoLiberacaoMembroEntity>) pedidoLiberacaoMembroRepository.findAll();
	}
}
