package com.manoelneto.planodenegocios.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manoelneto.planodenegocios.domain.Planosdenegocios;
import com.manoelneto.planodenegocios.services.PlanosdenegociosService;

@RestController
@RequestMapping(value="/planodenegocio")
public class PlanosdenegociosResources { /*O controlador Rest acessa o serviço*/

	@Autowired
	private PlanosdenegociosService service;
	
	@RequestMapping(method =RequestMethod.GET)
	public ResponseEntity<List<Planosdenegocios>> findAll(){
		List<Planosdenegocios> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
