package com.generation.lojaDeJogos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
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
	@Size(min = 10, max = 1000, message = "Este atributo tem que ter no mínimo 10 caracteres e no máximo 1000 caracteres")
	private String descrição;
	
	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	@Size(min = 1, max = 100, message = "Este atributo tem que ter no mínimo 1 caracteres e no máximo 1000 caracteres")
	private String console;
	
	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	private Long quantidade;
	
	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	private float preco;
	
	
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@ManyToOne
	@JsonIgnoreProperties("produto")
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

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	
}
