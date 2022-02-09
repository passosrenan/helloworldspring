package br.senai.sp.cotia.hellospring.model;

public enum TipoProduto {
	PERECIVEL("Perec�vel"), 
	NAO_PERECIVEL("N�o perec�vel"),
	MEIO_PERECIVEL("Meio perec�vel");
	
	String descricao;

	private TipoProduto(String desc) {
		this.descricao = desc;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}

}
