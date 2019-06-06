package com.manoelneto.planodenegocios.introducaoaoplano.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manoelneto.planodenegocios.introducaoaoplano.domain.Resumo;
import com.manoelneto.planodenegocios.introducaoaoplano.services.ResumoService;

@RestController
@RequestMapping(value="/planodenegocio/resumo")
public class ResumoResources 
	{
	
	@Autowired
	private ResumoService service;
	
	@RequestMapping(method =RequestMethod.GET)
	public ResponseEntity<List<Resumo>> findAll(){
		List<Resumo> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
