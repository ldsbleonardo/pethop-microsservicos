package br.infnet.leandro.liberacaopedido.dto;

import java.math.BigDecimal;

public class PedidoLiberacaoMembroDto {
	
	private Long id;
	
	private String subcredito;
	
	private BigDecimal valorLiberacaoMembro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubcredito() {
		return subcredito;
	}

	public void setSubcredito(String subcredito) {
		this.subcredito = subcredito;
	}

	public BigDecimal getValorLiberacaoMembro() {
		return valorLiberacaoMembro;
	}

	public void setValorLiberacaoMembro(BigDecimal valorLiberacaoMembro) {
		this.valorLiberacaoMembro = valorLiberacaoMembro;
	}

	@Override
	public String toString() {
		return "PedidoLiberacaoMembroDto [id=" + id + ", subcredito=" + subcredito + ", valorLiberacaoMembro="
				+ valorLiberacaoMembro + "]";
	}
	
	
	
	
}


