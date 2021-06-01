package com.sinfloo.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sinfloo.interfaces.PersonaInterface;
import com.sinfloo.modelo.Persona;

@Repository
public class PersonDAO implements PersonaInterface {

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = template.queryForList("select * from person");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Person p) {
		String sql = "insert into person(firstname,lastname)values(?,?)";
		return template.update(sql, p.getF_name(), p.getL_name());
	}

	@Override
	public int edit(Person p) {
		String sql="update person set f_name=?, l_name=? where id=?";		
		return template.update(sql,p.getF_name(),p.getL_name(),p.getId());
	}

	@Override
	public int delete(int id) {
		String sql="delete from person where id=?";
		return template.update(sql,id);
	}

}
