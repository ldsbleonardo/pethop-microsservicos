package br.infnet.leandro.liberacaopedido.dto;

public class FornecedorDto {

		private Long codigo;
		
		private String cnpj;
		
		private String nome;
		
		private String endereco;
		
		public FornecedorDto() {
			
		}
				
		public FornecedorDto(Long codigo, String cnpj, String nome, String endereco) {
			super();
			this.codigo = codigo;
			this.cnpj = cnpj;
			this.nome = nome;
			this.endereco = endereco;
		}


		public Long getCodigo() {
			return codigo;
		}

		public void setCodigo(Long codigo) {
			this.codigo = codigo;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		@Override
		public String toString() {
			return "FornecedorDto [codigo=" + codigo + ", cnpj=" + cnpj + ", nome=" + nome + ", endereco=" + endereco
					+ "]";
		}
		
		
			
	}

