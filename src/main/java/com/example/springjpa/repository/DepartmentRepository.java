package com.example.springjpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.springjpa.entity.Departamento;
@Repository
public interface DepartmentRepository extends JpaRepository<Departamento, Integer>{
	
	@Query(value = "{call SP_LISTA_DEPARTMENT()}", nativeQuery = true) 
	List<Departamento> listaDepartamentos();
	
	@Query(value = "{call SP_BUSCAR_DEPARTMENT(:V_IDDEPT)}", nativeQuery = true) 
	Optional<Departamento> readId(@Param("V_IDDEPT") int V_IDDEPT);
	
	@Query(value = "{call SP_INS_DEPARTMENT(:P_DEPTNAME, :P_MANAGER, :P_LOCATIONID, :P_ESTADO, @V_ID)}", nativeQuery = true) 
	String saveDepartment(@Param("P_DEPTNAME") String P_DEPTNAME,
			@Param("P_MANAGER") int P_MANAGER, @Param("P_LOCATIONID") int P_LOCATIONID,
			@Param("P_ESTADO") String P_ESTADO);
	
}
