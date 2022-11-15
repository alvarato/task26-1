package com.pacoteck.springboot.app.service;

import java.util.List;
import com.pacoteck.springboot.app.dto.Proveedor;

public interface IProveedorService {

	public List<Proveedor> findAll();
	public void deleteById(int id);
	public void create(Proveedor proveedor);
	public void update(Proveedor proveedor);
}
