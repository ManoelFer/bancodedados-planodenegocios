package com.manoelneto.planodenegocios.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.manoelneto.planodenegocios.domain.Planosdenegocios;
import com.manoelneto.planodenegocios.repository.PlanosdenegociosRepository;

@Configuration
public class Instantiationplano implements CommandLineRunner {

	@Autowired
	private PlanosdenegociosRepository planoRepository;

	
	@Override
	public void run(String... args) throws Exception {
		
		planoRepository.deleteAll();
		
		Planosdenegocios plano1 = new Planosdenegocios(null, "abrir puteiro", "20/09/2020", "Empreendedorizmo");
		Planosdenegocios plano2 = new Planosdenegocios(null, "abrir cabaré", "20/09/2020", "Empreendedorizmo");
		Planosdenegocios plano3 = new Planosdenegocios(null, "abrir casa de prostituição", "20/09/2020", "Empreendedorizmo");
		
		planoRepository.saveAll(Arrays.asList(plano1, plano2, plano3));
	}
		
}
