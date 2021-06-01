package com.mira.controler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinfloo.modelo.Persona;
import com.sinfloo.service.PersonaService;

@RestController
@RequestMapping("/persons")
public class PersonControler {
	
	@Autowired
	private PersonService service;
	
	@GetMapping("/list")
	public List<Map<String, Object>> list(Model model) {
		return service.list();
	}
		
	@PostMapping("/add")
	public String save(@RequestBody Persona p,Model model) {
		int id=service.add(p);
		if(id==0) {
			return "Failed to register!";
		}
		return "Successfully registered!";
	}
	
	@PostMapping("/update/{id}")
	public String save(@RequestBody Persona p,@PathVariable int id,Model model) {
		p.setId(id);
		int r=service.edit(p);
		if(r==0) {
			return "Could not update!";
		}
		return "Successfully updated!";
	}
	@PostMapping("/remove/{id}")
	public String delete(@PathVariable int id,Model model) {
		int r=service.delete(id);
		if(r==0) {
			return "Can not be deleted";
		}
		return "Successfully Deleted!";
	}
	
}
