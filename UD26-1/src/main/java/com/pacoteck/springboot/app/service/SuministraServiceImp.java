package com.pacoteck.springboot.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pacoteck.springboot.app.dao.SuministraDAO;
import com.pacoteck.springboot.app.dto.Suministra;

@Service
public class SuministraServiceImp implements ISuministraService{
	
	@Autowired
	SuministraDAO dao;

	@Override
	public List<Suministra> findAll() {
		return dao.findAll();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public void create(Suministra suministra) {
		dao.save(suministra);
		
	}

	@Override
	public void update(Suministra suministra) {
		List<Suministra> aux = dao.findAll();
		for (Suministra suministra2 : aux) {
			if(suministra.getId() == suministra2.getId()) {
				dao.save(suministra);
				break;
			}
		}
		
	}

}
