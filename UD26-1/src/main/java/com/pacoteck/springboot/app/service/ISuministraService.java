package com.pacoteck.springboot.app.service;

import java.util.List;


import com.pacoteck.springboot.app.dto.Suministra;

public interface ISuministraService {

	public List<Suministra> findAll();
	public void deleteById(int id);
	public void create(Suministra suministra);
	public void update(Suministra suministra);
}
