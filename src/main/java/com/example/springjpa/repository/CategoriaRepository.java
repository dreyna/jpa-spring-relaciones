package com.example.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpa.entity.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
