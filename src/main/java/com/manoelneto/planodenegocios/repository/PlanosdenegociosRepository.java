package com.manoelneto.planodenegocios.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.manoelneto.planodenegocios.domain.Planosdenegocios;


@Repository
public interface PlanosdenegociosRepository extends MongoRepository<Planosdenegocios, String> {

}
