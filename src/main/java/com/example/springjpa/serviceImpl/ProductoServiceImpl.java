package com.example.springjpa.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjpa.entity.Producto;
import com.example.springjpa.repository.ProductoRepository;
import com.example.springjpa.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public Producto create(Producto al) {
		// TODO Auto-generated method stub
		return productoRepository.save(al);
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(id);
	}

	@Override
	public Producto update(Producto al) {
		// TODO Auto-generated method stub
		return productoRepository.save(al);
	}
	
}
