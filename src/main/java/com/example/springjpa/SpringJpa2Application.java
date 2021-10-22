package com.example.springjpa;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springjpa.entity.Cliente;
import com.example.springjpa.entity.Empleado;
import com.example.springjpa.entity.Venta;
import com.example.springjpa.repository.ClienteRepository;
import com.example.springjpa.repository.EmpleadoRepository;
import com.example.springjpa.repository.VentaRepository;

@SpringBootApplication
public class SpringJpa2Application implements CommandLineRunner{

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Autowired
	private VentaRepository ventaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpa2Application.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Empleado emp = new Empleado();
		emp.setNombres("Jonas");
		emp.setCargo("Gerente");
		//empleadoRepository.save(emp);
		Cliente cl = new Cliente();
		cl.setNombres("Ruperto");
		cl.setApellidos("Marcos");
		cl.setDireccion("La era");
		cl.setTelefono("989102");
		//clienteRepository.save(cl);
		
		Venta venta = new Venta();
		venta.setFecha(new Date(119, 6, 18));
		venta.setCliente(cl);
		venta.setEmpleado(emp);
		ventaRepository.save(venta);
		
	}

}
