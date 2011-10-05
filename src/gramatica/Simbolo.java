package Gramatica;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para representacao de um Simbolo no compilador
 * 
 *
 *
 * @author aersandersonsoares
 */
public class Simbolo {
   
	private int tipo;
	private String nome;
	
	private Object valor;
	
	
	public Simbolo(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return ("Tipo: "+getTipo()+" NomeSimbolo: "+getNome()+" Valor: "+getValor());
	}
	
	
}
