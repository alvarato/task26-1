package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacoteck.springboot.app.dto.Proveedor;

public interface ProveedorDAO extends JpaRepository<Proveedor, Integer>{

}
