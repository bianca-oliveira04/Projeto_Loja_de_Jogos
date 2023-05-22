package com.generation.lojaDeJogos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "tb_produto")
public class Produto {

	
	@Id //indica que esse atributo será uma chave primária na minha tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica que terá um auto-increment
	private Long Id;
	
	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	@Size(min = 1, max = 100, message = "Este atributo tem que ter no mínimo 1 caracteres e no máximo 100 caracteres")
	private String nome;
	
	
	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	@Size(min = 1, max = 100, message = "Este atributo tem que ter no mínimo 1 caracteres e no máximo 1000 caracteres")
	private String console;
	
	@NotNull(message = "Este atributo é de preenchimento obrigatório")
	private Integer quantidade;
	
	@NotNull(message = "Este atributo é de preenchimento obrigatório")
	private Double preco;
	
	
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@ManyToOne
	@JsonIgnoreProperties("produtos")
    private Categoria categoria;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
}
