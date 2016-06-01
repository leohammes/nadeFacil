package br.com.nadefacil.service;

import java.util.List;
import com.google.inject.Inject;
import br.com.nadefacil.bean.Hint;
import br.com.nadefacil.mapper.HintMapper;

public class AppServiceImpl implements AppService {

	private HintMapper hintMapper;

	@Inject
	public void setHintMapper(HintMapper hintMapper) {
		this.hintMapper = hintMapper;
	}

	public void doSimpleThing() {
		List<Hint> staffList = hintMapper.selectAll();
		//Hint hint = hintMapper.selectByCode(1);
	}
}