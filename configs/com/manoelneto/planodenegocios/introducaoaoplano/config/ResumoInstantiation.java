package com.manoelneto.planodenegocios.introducaoaoplano.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.manoelneto.planodenegocios.introducaoaoplano.domain.Resumo;
import com.manoelneto.planodenegocios.introducaoaoplano.repository.ResumoRepository;

@Configuration
public class ResumoInstantiation implements CommandLineRunner {

	@Autowired
	private ResumoRepository resumoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		resumoRepository.deleteAll();
		
		Resumo resumo1 = new Resumo(null, "Contratar umas putinhas");
		Resumo resumo2 = new Resumo(null, "Contratar umas cabritas");
		Resumo resumo3 = new Resumo(null, "Contratar umas vacas leiteras");
		
		resumoRepository.saveAll(Arrays.asList(resumo1, resumo2, resumo3));
	}

}
