package edu.unoesc.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

import org.springframework.beans.factory.annotation.Autowired;

import edu.unoesc.dao.ProfessorDAO;
import edu.unoesc.model.Professor;

@FacesConverter(value = "professorConverter", forClass = Professor.class)
public class ProfessorConverter implements javax.faces.convert.Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			Professor p = (Professor) component.getAttributes().get(value);
            return p;
        }
        return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value != null && (value instanceof Professor)) {
			Professor p = (Professor) value; 
			component.getAttributes().put( String.valueOf(p.getId()), p);
            return String.valueOf(p.getId());
        }

		return null;
	}

}
