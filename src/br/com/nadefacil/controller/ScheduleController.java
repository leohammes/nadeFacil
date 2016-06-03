package br.com.nadefacil.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class ScheduleController {

	@PostConstruct
	public void init() {
		System.out.println(" ScheduleController executou ");
	}
	
}
