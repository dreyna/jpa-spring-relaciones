package com.example.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpa.entity.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
