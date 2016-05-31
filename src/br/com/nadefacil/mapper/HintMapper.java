package br.com.nadefacil.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import br.com.nadefacil.bean.Hint;

public interface HintMapper {
	
	final String SELECT_ALL = "SELECT * FROM CARD";
	final String SELECT_BY_CODE = "SELECT * FROM CARD WHERE id = #{code}";

	/**
	 * Returns the list of all Freelancer instances from the database.
	 * 
	 * @return the list of all Freelancer instances from the database.
	 */
	@Select(SELECT_ALL)
	@Results(value = { @Result(property = "id", column = "id") })
	List<Hint> selectAll();

	/**
	 * Returns a Freelancer instance from the database.
	 * 
	 * @param id
	 *            primary key value used for lookup.
	 * @return A Freelancer instance with a primary key value equals to pk. null
	 *         if there is no matching row.
	 */
	@Select(SELECT_BY_CODE)
	@Results(value = { @Result(property = "id", column = "id") })
	Hint selectByCode(int code);
}