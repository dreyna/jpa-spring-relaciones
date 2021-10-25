package com.example.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpa.entity.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
