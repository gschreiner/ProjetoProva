package edu.unoesc.controller;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.unoesc.dao.ProfessorDAO;
import edu.unoesc.model.Professor;
import edu.unoesc.model.Professor;

@ManagedBean(name="professorMB")
@RequestScoped
public class ProfessorController {
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Professor> professores;
	private Professor professor = new Professor();	

	@ManagedProperty(value="#{ProfessorDAO}")
	private ProfessorDAO professorDao;
	
public void save() {
		
		if (professor.getId() != 0) {
			this.professorDao.updateProfessor(professor);
		}else {
			this.professorDao.insertProfessor(professor);
		}
		
		professor = new Professor();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Professor Salvo"));
	
	}
	
	public void delete(int id) {

		this.professorDao.deleteProfessor(id);		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Professor Excluido"));
		
	}
	
	public void load(int id) {
		professor = this.professorDao.getProfessorById(id);		
	}
	

	public ArrayList<Professor> getProfessores() {
		professores = new ArrayList(professorDao.getProfessores());
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		
		this.professores = professores;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ProfessorDAO getProfessorDao() {
		return professorDao;
	}

	public void setProfessorDao(ProfessorDAO professorDao) {
		this.professorDao = professorDao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
