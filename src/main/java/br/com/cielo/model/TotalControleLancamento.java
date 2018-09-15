package br.com.cielo.model;

public class TotalControleLancamento implements Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1228924165066070210L;
	private Long quantidadeLancamentos;
	private Long quantidadeRemessas;
	private Double valorLancamentos;
	
	public Long getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}
	public void setQuantidadeLancamentos(Long quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}
	public Long getQuantidadeRemessas() {
		return quantidadeRemessas;
	}
	public void setQuantidadeRemessas(Long quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}
	public Double getValorLancamentos() {
		return valorLancamentos;
	}
	public void setValorLancamentos(Double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}
	
}
