package edu.unoesc.controller;

import java.util.ArrayList;

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

@Controller
public class ProfessorController {

	@Autowired
	private ProfessorDAO professorDao;

	@RequestMapping(value = "/professores", method = RequestMethod.GET)
	public String professoresList(Model m) {

		ArrayList<Professor> professores = new ArrayList(professorDao.getProfessors());

		m.addAttribute("listProfessores", professores);
		m.addAttribute("professor", new Professor());

		return "ProfessoresView";
	}

	@RequestMapping(value = "/professorSave", method = RequestMethod.POST)
	public String save(@ModelAttribute("professor") Professor professor) {

		this.professorDao.insertProfessor(professor);

		return "redirect:/professores";
	}

	@RequestMapping(value = "/professorDetail/{id}")
	public String professor(@PathVariable int id, Model model) {

		Professor user = this.professorDao.getProfessorById(id);

		model.addAttribute("professor", new Professor());

		return "ProfessorDetail";

	}

	@RequestMapping(value = "/professorUpdate", method = RequestMethod.POST)
	public String professorEdit(@ModelAttribute("professor") Professor professor) {

		this.professorDao.updateProfessor(professor);

		return "redirect:/profs";
	}
	
	@RequestMapping(value = "/professorDelete/{id}")
	public String professorDelete(@PathVariable int id, Model model) {

		this.professorDao.deleteProfessor(id);

		

		return "Fessor";

	}

}
