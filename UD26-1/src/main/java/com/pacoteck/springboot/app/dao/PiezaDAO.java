package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacoteck.springboot.app.dto.Pieza;

public interface PiezaDAO extends JpaRepository<Pieza, Integer>{

}
