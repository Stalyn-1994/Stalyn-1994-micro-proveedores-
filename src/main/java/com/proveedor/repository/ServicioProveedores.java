package com.proveedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proveedor.model.proveedores;


public interface ServicioProveedores extends JpaRepository<proveedores, Integer>{

}
