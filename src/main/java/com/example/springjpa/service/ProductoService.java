package com.example.springjpa.service;

import java.util.List;

import com.example.springjpa.entity.Producto;



public interface ProductoService {
	List<Producto> readAll();
	Producto create(Producto al);
	Producto read(int id);
	void delete(int id);
	Producto update(Producto al);
}
