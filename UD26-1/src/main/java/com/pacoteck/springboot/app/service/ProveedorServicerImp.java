package com.pacoteck.springboot.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pacoteck.springboot.app.dao.ProveedorDAO;
import com.pacoteck.springboot.app.dto.Proveedor;

@Service
public class ProveedorServicerImp implements IProveedorService{

	@Autowired
	ProveedorDAO dao;

	@Override
	public List<Proveedor> findAll() {
		return dao.findAll();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public void create(Proveedor proveedor) {
		dao.save(proveedor);
		
	}

	@Override
	public void update(Proveedor proveedor) {
		List<Proveedor> aux = dao.findAll();
		for (Proveedor proveedor2 : aux) {
			if(proveedor.getId() == proveedor2.getId()) {
				dao.save(proveedor);
				break;
			}
		}
	}
	
	
}
