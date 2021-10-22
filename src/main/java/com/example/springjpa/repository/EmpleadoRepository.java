package com.example.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpa.entity.Empleado;
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

}
