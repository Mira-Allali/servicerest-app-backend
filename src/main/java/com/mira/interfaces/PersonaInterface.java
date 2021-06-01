package com.sinfloo.interfaces;

import java.util.List;
import java.util.Map;

import com.sinfloo.modelo.Persona;

public interface PersonaInterface{
	public List<Map<String, Object>>list();
	public List<Map<String, Object>>listarId(int id);
	public int add(Person p);
	public int edit(Person p);
	public int delete(int id);

}
