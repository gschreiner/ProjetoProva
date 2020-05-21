package edu.unoesc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DisciplinaController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/disciplinas", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "DisciplinaView";
	}

}
