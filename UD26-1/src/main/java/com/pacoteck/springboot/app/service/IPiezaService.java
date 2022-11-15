package com.pacoteck.springboot.app.service;

import java.util.List;

import com.pacoteck.springboot.app.dto.Pieza;

public interface IPiezaService {
	
	public List<Pieza> findAll();
	public void deleteById(int id);
	public void create(Pieza pieza);
	public void update(Pieza pieza);

}
