package com.example.demo.repository;

import com.example.demo.entidad.propiedad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface propiedadRepositorio extends  CrudRepository<propiedad, Long> {


}
