package com.salao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.salao.entities.Servico;

@Repository
public interface ServicoRepository extends CrudRepository<Servico, Integer>{

}
