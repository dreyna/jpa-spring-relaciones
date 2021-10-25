package com.example.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpa.entity.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
