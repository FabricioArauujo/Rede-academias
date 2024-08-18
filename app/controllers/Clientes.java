package controllers;

import java.util.List;

import models.Cliente;
import play.mvc.Controller;

public class Clientes extends Controller{

	
	public static void salvar(Cliente cliente) {
		
		cliente.save();
		listar();
	}
	
	public static void listar() {
		List<Cliente> cliente = Cliente.findAll();
		render(cliente);
	}
	
	public static void Remover(long id) {
		Cliente cliente = Cliente.findById(id);
		
		cliente.delete();
		listar();
	}
	
	public static void Editar(long id) {
		Cliente cliente = Cliente.findById(id);
		
		renderTemplate("Clientes/CadastrarClientes.html", id);
	}
	
	public static void CadastrarClientes() {
		render();
	}
}

