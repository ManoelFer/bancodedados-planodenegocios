package com.manoelneto.planodenegocios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoelneto.planodenegocios.domain.Planosdenegocios;
import com.manoelneto.planodenegocios.repository.PlanosdenegociosRepository;

@Service
public class PlanosdenegociosService {

	@Autowired
	private PlanosdenegociosRepository repo;/*O serviço acessa o repositório*/
	
	public List<Planosdenegocios> findAll(){
		return repo.findAll();
	}
}
