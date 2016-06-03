package br.com.nadefacil.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class GalleryController {

	@PostConstruct
	public void init() {
		System.out.println(" Gallery executou ");
	}
	
}
