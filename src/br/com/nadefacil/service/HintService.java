package br.com.nadefacil.service;

import java.util.List;
import br.com.nadefacil.bean.Hint;

public interface HintService {
	
	public Hint getHint(int id);
	
	public List<Hint> getAllHints();
	
	public boolean createHint(Hint hint);
	
	public boolean updateHint(Hint hint);
	
	public boolean deleteHint(int hintId);
}