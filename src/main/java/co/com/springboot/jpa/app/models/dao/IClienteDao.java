package co.com.springboot.jpa.app.models.dao;

import java.util.List;

import co.com.springboot.jpa.app.models.Cliente;

public interface IClienteDao {
	
	public List<Cliente> findAll();
	public void save(Cliente cliente);

}
