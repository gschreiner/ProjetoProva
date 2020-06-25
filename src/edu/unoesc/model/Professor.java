package edu.unoesc.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PROFESSORES")
public class Professor implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "dataNasc")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataNasc;

	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getDataNasFormated() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		if (this.dataNasc == null)
			return format.format(new Date());
		
		return format.format(this.dataNasc);
	}
	
	public String getDataNasDateInput() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		if (this.dataNasc == null)
			return format.format(new Date());
		
		return format.format(this.dataNasc);
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {

		return this.nome;
	}
}
