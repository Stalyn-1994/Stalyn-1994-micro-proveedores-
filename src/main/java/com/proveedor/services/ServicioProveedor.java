package com.proveedor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proveedor.model.proveedores;
import com.proveedor.repository.ServicioProveedores;



@Service 
public class ServicioProveedor {


	@Autowired
	private ServicioProveedores transacctionResporitory;
	
		
	public List<proveedores> getAllPersonas (){
		return transacctionResporitory.findAll();
	}
}
