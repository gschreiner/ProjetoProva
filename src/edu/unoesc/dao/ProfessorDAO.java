package edu.unoesc.dao;

import java.util.List;

import edu.unoesc.model.Professor;

public interface ProfessorDAO {

	Professor getProfessorById (int id);
	List<Professor> getProfessors();
	boolean deleteProfessor(int id);
	boolean insertProfessor(Professor p);
	boolean updateProfessor(Professor p);
	
}
