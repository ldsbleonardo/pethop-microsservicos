package br.infnet.leandro.liberacaopedido.dto;

import java.math.BigDecimal;

public class PedidoLiberacaoDto {
	
	private Long id;
	
	private String operacao;
	
	private BigDecimal valorTotal;
	
	private Long idFornecedor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	@Override
	public String toString() {
		return "PedidoLiberacaoDto [id=" + id + ", operacao=" + operacao + ", valorTotal=" + valorTotal + ", idCliente="
				+ idFornecedor + "]";
	}
	
	
}


