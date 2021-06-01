package com.sinfloo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Person")
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String f_name;
	@Column
	private String l_name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String n) {
		this.f_name = n;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String n) {
		this.l_name = n;
	}
	
}
