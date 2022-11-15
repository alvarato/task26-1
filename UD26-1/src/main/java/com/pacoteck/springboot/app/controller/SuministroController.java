package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pacoteck.springboot.app.dto.Suministra;
import com.pacoteck.springboot.app.service.SuministraServiceImp;

@RestController
@RequestMapping("/suministros")
public class SuministroController {

	@Autowired
	SuministraServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Suministra> findAll(){
		return imp.findAll();
	}
	
	@PutMapping("/delete{id}")
	public void deleteById(@PathVariable("id") int id) {
		imp.deleteById(id);
	}
	
	@PutMapping("/create")
	public void create(@RequestBody Suministra suministra) {
		imp.create(suministra);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Suministra suministra) {
		imp.update(suministra);
	}
}
