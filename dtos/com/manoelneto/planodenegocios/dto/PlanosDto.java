package com.manoelneto.planodenegocios.dto;

import java.io.Serializable;

import com.manoelneto.planodenegocios.domain.Planosdenegocios;

public class PlanosDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String token;
	private String nomedoplano;
	private String dataconclusao;
	private String finalidade;
	
	public PlanosDto() {
	}
	
	public PlanosDto(Planosdenegocios obj) {
		token = obj.getToken();
		nomedoplano = obj.getNomedoplano();
		dataconclusao = obj.getDataconclusao();
		finalidade = obj.getFinalidade();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getNomedoplano() {
		return nomedoplano;
	}

	public void setNomedoplano(String nomedoplano) {
		this.nomedoplano = nomedoplano;
	}

	public String getDataconclusao() {
		return dataconclusao;
	}

	public void setDataconclusao(String dataconclusao) {
		this.dataconclusao = dataconclusao;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	
	
}
