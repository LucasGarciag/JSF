package br.com.dio.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.dio.model.Evento;

//@Named diz que essa classe é meu controlador
@Named
//SessionScoped tras os dados vindo do formulario para a classe Evento. Guardando os dados em sessão.
@SessionScoped
public class EventoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Evento evento;

	private List<Evento> eventos = new ArrayList<>();

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	// Metodo para exibir informações do formulario
	public void adicionarEvento() {
		eventos.add(evento);
		System.out.println("Evento " + evento + " cadastrado com sucesso");
		clean();
	}
	
	//Limpando o formulario
	public void clean() {
		this.evento = new Evento();
	}
}
