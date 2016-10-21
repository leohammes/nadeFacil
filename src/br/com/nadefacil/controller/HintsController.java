package br.com.nadefacil.controller;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import com.google.inject.Injector;

import br.com.nadefacil.application.Page;
import br.com.nadefacil.bean.Hint;
import br.com.nadefacil.service.HintService;

@ViewScoped
@ManagedBean
public class HintsController {
	
	private int currentHintId;
	private Hint currentHint;

	public HintService getHintsService() {
		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
		Injector injector = (Injector) servletContext.getAttribute("injector");
		HintService service = injector.getInstance(HintService.class);
		return service;
	}
	
	public List<Hint> getHints() {
		return getHintsService().getAllHints(Page.HINTS);
	}
	
	public void readMoreAction(int id) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		setCurrentHintId(id);
		ec.redirect("/info/" + id);
	}

	public int getCurrentHintId() {
		return currentHintId;
	}

	public void setCurrentHintId(int currentHint) {
		this.currentHintId = currentHint;
		setCurrentHint(getHintsService().getHint(currentHint));
	}
	
	public void setCurrentHint(Hint currentHint) {
		this.currentHint = currentHint;
	}
	
	public Hint getCurrentHint() {
		return currentHint;
	}
	
}
