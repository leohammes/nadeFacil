package br.com.nadefacil.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class IndexController {
	
	public String getMessage() {
		return "leonardo";
	}
}
