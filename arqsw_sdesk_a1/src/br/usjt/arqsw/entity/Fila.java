package br.usjt.arqsw.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 * @author Filipe Roque Charamello R.A 816118349 - Ciencia Da Computa��o
 */
@Entity
@Table(name="Fila")
public class Fila implements Serializable{

	private static final long serialVersionUID = 1L;

	@NotNull(message="A fila nao pode ser vazia")
	@Min(value=1, message="A fila nao pode ser vazia")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Id
	@Column(name="ID_FILA")
	private int id;
	
	@Column(name="NM_FILA")
	private String nome;
	
	@Size(max=45)
	@Column(name="nm_figura")
	private String figura;
	
	public String getFigura() {
		return figura;
	}
	public void setFigura(String figura) {
		this.figura = figura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Fila [id=" + id + ", nome=" + nome + "]";
	}
	
}
