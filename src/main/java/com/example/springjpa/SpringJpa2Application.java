package com.example.springjpa;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springjpa.entity.Categoria;
import com.example.springjpa.entity.Cliente;
import com.example.springjpa.entity.Departamento;
import com.example.springjpa.entity.DetalleVenta;
import com.example.springjpa.entity.Empleado;
import com.example.springjpa.entity.Producto;
import com.example.springjpa.entity.Rol;
import com.example.springjpa.entity.Usuario;
import com.example.springjpa.entity.Venta;
import com.example.springjpa.repository.CategoriaRepository;
import com.example.springjpa.repository.ClienteRepository;
import com.example.springjpa.repository.DepartmentRepository;
import com.example.springjpa.repository.DetalleVentaRepositoy;
import com.example.springjpa.repository.EmpleadoRepository;
import com.example.springjpa.repository.ProductoRepository;
import com.example.springjpa.repository.RolRepository;
import com.example.springjpa.repository.UsuarioRepository;
import com.example.springjpa.repository.VentaRepository;

@SpringBootApplication
public class SpringJpa2Application implements CommandLineRunner{

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Autowired
	private VentaRepository ventaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RolRepository rolRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	private DetalleVentaRepositoy detalleRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpa2Application.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		/*
		//Registrar empleado
		Empleado emp = new Empleado();
		emp.setNombres("Jonas");
		emp.setCargo("Gerente");
		//empleadoRepository.save(emp);
		//registrar Rol
		Rol r = new Rol();
		r.setNomrol("Adminstrador");
		//rolRepository.save(r);
		//registrar Cliente
		Cliente cl = new Cliente();
		cl.setNombres("Ruperto");
		cl.setApellidos("Marcos");
		cl.setDireccion("La era");
		cl.setTelefono("989102");
		//clienteRepository.save(emp);
		List<Rol> roles = rolRepository.findAll();
		Empleado empl = empleadoRepository.findById(1).get();
		Usuario u = new Usuario();
		u.setUsername("jonas123");
		u.setPassword("1234567");
		u.setRoles(roles);
		u.setEmpleado(empl);
		u.setEstado(1);
		//usuarioRepository.save(u);
		//e1 = empleadoRepository.findById(1).get();
		Usuario u1 = usuarioRepository.findById(7).get();
		Cliente c1 = clienteRepository.findById(1).get();
		Venta venta = new Venta();
		venta.setFecha(new Date(119, 6, 18));
		venta.setCliente(c1);
		venta.setUsuario(u1);
		//Categoria
		Categoria cat = new Categoria();
		cat.setNomcat("Detergentes");
		//categoriaRepository.save(cat);
		//ventaRepository.save(venta);
		Categoria cat1 = categoriaRepository.findById(55).get();
		Producto prod = new Producto();
		prod.setNombre("Ariel 350gr");
		prod.setPrecio(8.5);
		prod.setStock(10);
		prod.setCategoria(cat1);
		productoRepository.save(prod);
		Venta v1 = ventaRepository.findById(2).get();
		Producto p1 = productoRepository.findById(1).get();
		DetalleVenta dv = new DetalleVenta();
		dv.setPrecio(p1.getPrecio());
		dv.setCantidad(10);
		dv.setVenta(v1);
		dv.setProducto(p1);
		//detalleRepository.save(dv);
		//departmentRepository.saveDepartment("Facultad de Salud",300, 110, "1");
		//departmentRepository.saveDepartment("Finanzas", 3, 1, "1");
	/*	
		List<Departamento> dptos = departmentRepository.listaDepartamentos();
		for(int i=0;i<dptos.size(); i++) {
			System.out.println(dptos.get(i).getDepartment_name());
		}
		/*
	Departamento dpto = departmentRepository.readId(7).get();
	System.out.println("Departamento: "+dpto.getDepartment_name());
	
	System.out.println(departmentRepository.depatmentDel(8));	*/
		
	}

}
