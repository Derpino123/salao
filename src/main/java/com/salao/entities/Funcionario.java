package com.salao.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "funcionarios")
public class Funcionario {	

	@Id
	@GeneratedValue
	private Integer matricula;

	@Column(name ="tx_nome")
	private String nome;
	@Column(name ="tx_cpf")
	private String cpf;
	@Column(name ="tx_rg")
	private String rg;
	@Column(name ="dt_data_nascimento")
	private String dataNascimento;
	@Column(name ="tx_endereco")
	private String endereco;
	@Column(name ="tx_uf")
	private String uf;


	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}


}
