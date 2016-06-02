package br.com.nadefacil.service.impl;

import java.util.List;
import com.google.inject.Inject;
import br.com.nadefacil.bean.Hint;
import br.com.nadefacil.mapper.HintMapper;
import br.com.nadefacil.service.HintService;

public class HintServiceImpl implements HintService {

	private HintMapper hintMapper;

	@Inject
	public void setHintMapper(HintMapper hintMapper) {
		this.hintMapper = hintMapper;
	}

	@Override
	public Hint getHint(int id) {
		return hintMapper.selectByCode(id);
	}

	@Override
	public List<Hint> getAllHints() {
		List<Hint> hints = hintMapper.selectAll();
		return hints;
	}

	@Override
	public boolean createHint(Hint hint) {
		return hintMapper.createHint(hint);
	}

	@Override
	public boolean updateHint(Hint hint) {
		return hintMapper.updateHint(hint);
	}

	@Override
	public boolean deleteHint(int hintId) {
		return hintMapper.deleteHint(hintId);
	}
}