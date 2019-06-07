package com.manoelneto.planodenegocios.introducaoaoplano.dto;

import java.io.Serializable;

import com.manoelneto.planodenegocios.introducaoaoplano.domain.Resumo;

public class ResumoDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String token;
	private String resumodoplano;
	
	public ResumoDto(){
	}
	
	public ResumoDto(Resumo obj){
		token = obj.getToken();
		resumodoplano = obj.getResumodoplano();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getResumodoplano() {
		return resumodoplano;
	}

	public void setResumodoplano(String resumodoplano) {
		this.resumodoplano = resumodoplano;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
