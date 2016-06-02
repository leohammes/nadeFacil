package br.com.nadefacil.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.com.nadefacil.bean.Hint;
import br.com.nadefacil.bean.Image;

public interface HintMapper {
	
	final String SELECT_ALL = "SELECT * FROM CARD";
	final String SELECT_BY_CODE = "SELECT * FROM CARD WHERE id = #{id}";
	final String CREATE_HINT = "INSERT INTO CARD (TITLE, DESCRIPTION, IMAGE, DATE) VALUES (#{hint.title}, #{hint.description}, #{hint.image.id}, Convert(date, getdate()))";
	final String UPDATE_HINT = "UPDATE CARD SET TITLE=#{hint.title}, description=#{hint.description}, image=#{hint.image.id}, date=Convert(date, getdate()) where id=#{hint.id};";
	final String DELETE_HINT = "DELETE FROM CARD WHERE id=#{id};";

	@Select(SELECT_ALL)
	@Results(value = {
		@Result(column = "image", property = "image", javaType=Image.class, one=@One(select="br.com.nadefacil.mapper.ImageMapper.selectByCode"))
	})
	List<Hint> selectAll();
	
	@Select(SELECT_BY_CODE)
	Hint selectByCode(int id);
	
	@Insert(CREATE_HINT)
	boolean createHint(Hint hint);
	
	@Update(UPDATE_HINT)
	boolean updateHint(Hint hint);
	
	@Delete(DELETE_HINT)
	boolean deleteHint(int id);
} 