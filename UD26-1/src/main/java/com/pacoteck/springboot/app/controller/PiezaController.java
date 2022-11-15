package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pacoteck.springboot.app.dto.Pieza;
import com.pacoteck.springboot.app.service.PiezaServiceImp;

@RestController
@RequestMapping("/piezas")
public class PiezaController {

	@Autowired
	PiezaServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Pieza> findAll(){
		return imp.findAll();
	}
	
	@PutMapping("/delete{id}")
	public void deleteById(@PathVariable("id") int id) {
		imp.deleteById(id);
	}
	
	@PutMapping("/create")
	public void create(@RequestBody Pieza pieza) {
		imp.create(pieza);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Pieza pieza) {
		imp.update(pieza);
	}
}
