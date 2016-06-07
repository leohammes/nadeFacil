package br.com.nadefacil.controller;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import com.google.inject.Injector;

import br.com.nadefacil.application.Page;
import br.com.nadefacil.bean.Hint;
import br.com.nadefacil.service.HintService;

@RequestScoped
@ManagedBean
public class HintsController {

	public List<Hint> getHints() {
		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
		Injector injector = (Injector) servletContext.getAttribute("injector");
		HintService service = injector.getInstance(HintService.class);
		List<Hint> hints = service.getAllHints(Page.HINTS);
		return hints;
	}
	
	public String readMoreAction(int id) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect("/dicas/" + id);
		return "/";
	}
	
}
