package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pacoteck.springboot.app.dto.Proveedor;
import com.pacoteck.springboot.app.service.ProveedorServicerImp;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

	@Autowired
	ProveedorServicerImp imp;
	
	@GetMapping("/findAll")
	public List<Proveedor> findAll(){
		return imp.findAll();
	}
	
	@PutMapping("/delete{id}")
	public void deleteById(@PathVariable("id") int id) {
		imp.deleteById(id);
	}
	
	@PutMapping("/create")
	public void create(@RequestBody Proveedor proveedor) {
		imp.create(proveedor);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Proveedor proveedor) {
		imp.update(proveedor);
	}
}
