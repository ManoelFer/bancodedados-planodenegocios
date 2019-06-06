package com.manoelneto.planodenegocios.introducaoaoplano.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoelneto.planodenegocios.introducaoaoplano.domain.Resumo;
import com.manoelneto.planodenegocios.introducaoaoplano.repository.ResumoRepository;

@Service
public class ResumoService {

	@Autowired
	private ResumoRepository repo;
	
	public List<Resumo> findAll(){
		return repo.findAll();
	}
}
