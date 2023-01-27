package br.infnet.leandro.liberacaopedido.dto;

import java.util.List;

public class PedidoLiberacaoResponseDto {
	
	private FornecedorDto fornecedorDto;
	
	private List<PedidoLiberacaoMembroDto> pedidoLiberacaoMembroDto;
	
	public PedidoLiberacaoResponseDto() {
		
	}
	
	public PedidoLiberacaoResponseDto(FornecedorDto fornecedorDto, List<PedidoLiberacaoMembroDto> pedidoLiberacaoMembroDto) {
		super();
		this.fornecedorDto = fornecedorDto;
		this.pedidoLiberacaoMembroDto = pedidoLiberacaoMembroDto;
	}

	public FornecedorDto getFornecedorDto() {
		return fornecedorDto;
	}

	public void setFornecedorDto(FornecedorDto fornecedorDto) {
		this.fornecedorDto = fornecedorDto;
	}

	public List<PedidoLiberacaoMembroDto> getPedidoLiberacaoMembroDto() {
		return pedidoLiberacaoMembroDto;
	}

	public void setPedidoLiberacaoMembroDto(List<PedidoLiberacaoMembroDto> pedidoLiberacaoMembroDto) {
		this.pedidoLiberacaoMembroDto = pedidoLiberacaoMembroDto;
	}
	
	
}
