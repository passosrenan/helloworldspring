package br.senai.sp.cotia.hellospring.model;

public enum TipoProduto {
	PERECIVEL("Perecível"), 
	NAO_PERECIVEL("Não perecível"),
	MEIO_PERECIVEL("Meio perecível");
	
	String descricao;

	private TipoProduto(String desc) {
		this.descricao = desc;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}

}
