package com.manoelneto.planodenegocios.introducaoaoplano.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.manoelneto.planodenegocios.introducaoaoplano.domain.Resumo;

@Repository
public interface ResumoRepository extends MongoRepository<Resumo, String> {

}
