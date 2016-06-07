package br.com.nadefacil.controller;

import java.io.IOException;
import java.util.ArrayList;
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
public class IndexController {
	
	public List<String> getSlideShowImageSrcs() {
		List<String> srcs = new ArrayList<String>();
		srcs.add("/image/slide-show-1.jpg");
		srcs.add("/image/slide-show-2.jpg");
		srcs.add("/image/slide-show-3.jpg");
		return srcs;
	}
	
	public String goToPaginaInicial() {
		return "/index?faces-redirect=true";
	}
	
	public String goToModalidades() {
	    return "/modalidades?faces-redirect=true";
	}
	
	public String goToDicasDaSemana() {
		return "/dicasDaSemana?faces-redirect=true";
	}
	
	public String goToHistoria() {
		return "/historia?faces-redirect=true";
	}
	
	public String goToContato() {
		return "/contato?faces-redirect=true";
	}
	
	public String goToHorarios() {
		return "/horarios?faces-redirect=true";
	}
	
	public String goToGaleria() {
		return "/galeria?faces-redirect=true";
	}
	
	public String getImageSrc() {
		return "/image/natacao-card-header.jpg";
	}
	
	public String getGMapLocation() {
		return "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3558.5362006074997!2d-49.08147918536033!3d-26.886472898585208!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94df1f1fa0e67a99%3A0x18ab15eb5b366fdd!2sNade+F%C3%A1cil+Academia+de+Nata%C3%A7%C3%A3o+e+Hidrogin%C3%A1stica!5e0!3m2!1spt-BR!2sbr!4v1465000066827";
	}
	
	public String readMoreAction(int id) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect("/index/" + id);
		return "/";
	}
	
	public List<Hint> getHints() {
		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
		Injector injector = (Injector) servletContext.getAttribute("injector");
		HintService service = injector.getInstance(HintService.class);
		
		List<Hint> hints = service.getAllHints(Page.INDEX);
		
		return hints;
	}
}
