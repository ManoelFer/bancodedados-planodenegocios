package com.manoelneto.planodenegocios.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manoelneto.planodenegocios.domain.Planosdenegocios;

@RestController
@RequestMapping(value="/planodenegocio")
public class PlanosdenegociosResources {

	@RequestMapping(method =RequestMethod.GET)
	public List<Planosdenegocios> findAll(){
		Planosdenegocios plano1 = new Planosdenegocios("1", "abrir açougue", "05/01/2020", "Empreendedorismo");
		Planosdenegocios plano2 = new Planosdenegocios("2", "abrir papelaria", "05/01/2020", "Empreendedorismo");
		List<Planosdenegocios> list = new ArrayList<>();
		list.addAll(Arrays.asList(plano1, plano2));
		return list;
	}
}
