package com.example.demo.repository;

import com.example.demo.entidad.PropertyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PropertyRepository extends  CrudRepository<PropertyEntity, Long> {

    Optional<PropertyEntity> findByName(String name);

    List<PropertyEntity> findByPriceBetweenAndAvailabilityTrue(double minPrice, double maxPrice);
}
