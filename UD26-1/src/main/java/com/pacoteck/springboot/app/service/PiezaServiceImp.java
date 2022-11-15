package com.pacoteck.springboot.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pacoteck.springboot.app.dao.PiezaDAO;
import com.pacoteck.springboot.app.dto.Pieza;

@Service
public class PiezaServiceImp implements IPiezaService{

	@Autowired
	PiezaDAO dao;

	@Override
	public List<Pieza> findAll() {
		return dao.findAll();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public void create(Pieza pieza) {
		dao.save(pieza);
		
	}

	@Override
	public void update(Pieza pieza) {
		List<Pieza> aux = dao.findAll();
		for (Pieza pieza2 : aux) {
			if(pieza.getCodigo() == pieza2.getCodigo()) {
				dao.save(pieza);
				break;
			}
		}
		
	}
}
