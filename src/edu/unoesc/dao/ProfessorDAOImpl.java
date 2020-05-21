package edu.unoesc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.unoesc.model.Professor;

@Repository
public class ProfessorDAOImpl implements ProfessorDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public Professor getProfessorById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Professor p = (Professor) session.get(Professor.class, new Integer(id));
		
		return p;
	}

	@Override
	@Transactional
	public List<Professor> getProfessors() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from Professor").list();
	}

	@Override
	public boolean deleteProfessor(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Professor p = (Professor) session.load(Professor.class, new Integer(id));
		if (p!=null) {
			session.delete(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean insertProfessor(Professor p) {
		
		this.sessionFactory.getCurrentSession().save(p);
		
		return false;
	}

	@Override
	public boolean updateProfessor(Professor p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		return true;
	}

}
