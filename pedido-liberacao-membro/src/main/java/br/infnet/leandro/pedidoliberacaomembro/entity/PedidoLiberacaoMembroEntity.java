package br.infnet.leandro.pedidoliberacaomembro.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PedidoLiberacaoMembroEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String subcredito;
	
	private BigDecimal valorLiberacaoMembro;
	
	public PedidoLiberacaoMembroEntity() {
		
	}
	
	public PedidoLiberacaoMembroEntity(Long id, String subcredito, BigDecimal valorLiberacaoMembro) {
		super();
		this.id = id;
		this.subcredito = subcredito;
		this.valorLiberacaoMembro = valorLiberacaoMembro;
	}

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
		return "PedidoLiberacaoMembroEntity [id=" + id + ", subcredito=" + subcredito + ", valorLiberacaoMembro="
				+ valorLiberacaoMembro + "]";
	}
	
	
	
}
