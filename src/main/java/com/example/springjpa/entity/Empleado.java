package com.example.springjpa.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="empleado")
public class Empleado implements Serializable{/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idempleado")
	private int id;
	private String nombres;
	private String cargo;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="idventa")
	private Set<Venta> ventas;

	private static final long serialVersionUID = 3471382840121538109L;

}
