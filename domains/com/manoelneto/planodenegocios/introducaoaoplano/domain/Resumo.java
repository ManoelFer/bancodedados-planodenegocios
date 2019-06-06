package com.manoelneto.planodenegocios.introducaoaoplano.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="resumo")
public class Resumo implements Serializable{
	private static final long serialVersionUID = 1L;
	
		@Id
		private String token;
		private String resumodoplano;
		
		public Resumo() {
		}

		public Resumo(String token, String resumodoplano) {
			super();
			this.token = token;
			this.resumodoplano = resumodoplano;
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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((resumodoplano == null) ? 0 : resumodoplano.hashCode());
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
			Resumo other = (Resumo) obj;
			if (resumodoplano == null) {
				if (other.resumodoplano != null)
					return false;
			} else if (!resumodoplano.equals(other.resumodoplano))
				return false;
			if (token == null) {
				if (other.token != null)
					return false;
			} else if (!token.equals(other.token))
				return false;
			return true;
		}
}
