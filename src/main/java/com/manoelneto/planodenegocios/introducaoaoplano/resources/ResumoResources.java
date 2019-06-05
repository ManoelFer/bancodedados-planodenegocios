package com.manoelneto.planodenegocios.introducaoaoplano.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manoelneto.planodenegocios.introducaoaoplano.domain.Resumo;

@RestController
@RequestMapping(value="/planodenegocio/resumo")
public class ResumoResources 
	{
	
	@RequestMapping(method =RequestMethod.GET)
	public List<Resumo> findAll(){
		Resumo resumo1 = new Resumo("1", "primeiro resumo.");
		Resumo resumo2 = new Resumo("2", "segundo resumo.");
		List<Resumo> list = new ArrayList<>();
		list.addAll(Arrays.asList(resumo1, resumo2));
		return list;
	}
}
