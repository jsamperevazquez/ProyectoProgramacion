package com.proyecto.app.repository;

import com.proyecto.app.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Creado por @autor: angel,David
 * El  15 de mar. de 2021.
 * Interface para permitir usar métodos de JpaRepository
 */

@Repository //Le decimos que es componente de tipo Repositorio (DAO)
public interface ClientesRepository extends JpaRepository<Clientes,String>  {  //objeto Clientes y tipo de ID
// Queremos implementar todos los metodos del CRUD de jpaRepository
}
