package com.salao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.salao.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}
