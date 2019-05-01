package com.salao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.salao.enums.CategoriaServico;

@Entity(name = "categorias")
public class Categoria {

	@Id
	@GeneratedValue
	private Integer id;
	@Column(name ="tx_tipo")
	private CategoriaServico tipo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CategoriaServico getTipo() {
		return tipo;
	}

	public void setTipo(CategoriaServico tipo) {
		this.tipo = tipo;
	}

}
