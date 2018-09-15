package br.com.cielo.model;

public class ControleLancamentoRetorno implements Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8712670523118698447L;

	private TotalControleLancamento totalControleLancamento;
	private ControleLancamento[] listaControleLancamento;
	private Integer indice;
	private Integer tamanhoPagina;
	private Integer totalElements;

	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}
	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}
	public ControleLancamento[] getListaControleLancamento() {
		return listaControleLancamento;
	}
	public void setListaControleLancamento(ControleLancamento[] listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}
	public Integer getIndice() {
		return indice;
	}
	public void setIndice(Integer indice) {
		this.indice = indice;
	}
	public Integer getTamanhoPagina() {
		return tamanhoPagina;
	}
	public void setTamanhoPagina(Integer tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}
	public Integer getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}
	
}
