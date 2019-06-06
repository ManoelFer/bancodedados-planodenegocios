package com.manoelneto.planodenegocios.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="planodenegocio")
public class Planosdenegocios implements Serializable {
	private static final long serialVersionUID = 1L;
	/*Serializable para transformar os objetos em bits para que possa ser trafegado em redes*/
	
	@Id
	private String token;
	private String nomedoplano;
	private String dataconclusao;
	private String finalidade;
	
	public Planosdenegocios() {
	}

	public Planosdenegocios(String token, String nomedoplano, String dataconclusao, String finalidade) {
		super();
		this.token = token;
		this.nomedoplano = nomedoplano;
		this.dataconclusao = dataconclusao;
		this.finalidade = finalidade;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataconclusao == null) ? 0 : dataconclusao.hashCode());
		result = prime * result + ((finalidade == null) ? 0 : finalidade.hashCode());
		result = prime * result + ((nomedoplano == null) ? 0 : nomedoplano.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planosdenegocios other = (Planosdenegocios) obj;
		if (dataconclusao == null) {
			if (other.dataconclusao != null)
				return false;
		} else if (!dataconclusao.equals(other.dataconclusao))
			return false;
		if (finalidade == null) {
			if (other.finalidade != null)
				return false;
		} else if (!finalidade.equals(other.finalidade))
			return false;
		if (nomedoplano == null) {
			if (other.nomedoplano != null)
				return false;
		} else if (!nomedoplano.equals(other.nomedoplano))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		return true;
	}
	
}
