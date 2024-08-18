package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.jpa.Model;

@Entity
public class Cliente extends Model{
	
	public String nome; 
	public String sobrenome;
	public String contato;
	public Date data;
	public String CPF;
	public String turnoTreino;
	public String acompanhamentoPersonal;
	public String formaPagamento;
	public int idAcademia;
	public int idPersonal;
}
