package br.com.nadefacil.service;

import java.util.List;

import br.com.nadefacil.application.Page;
import br.com.nadefacil.bean.Hint;

public interface HintService {
	
	public Hint getHint(int id);
	
	public List<Hint> getAllHints(Page page);
	
	public boolean createHint(Hint hint);
	
	public boolean updateHint(Hint hint);
	
	public boolean deleteHint(int hintId);
}