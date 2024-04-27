package com.example.demo.service;

import com.example.demo.dto.ListPropertyResponse;
import com.example.demo.entidad.PropertyEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPropertyService {
    PropertyEntity createProperty(PropertyEntity property);

    ListPropertyResponse getProperties(double minPrice, double maxPrice);

    PropertyEntity UpdateProperty(PropertyEntity property);

    void  deleteProperty(Long id);

    void relentProperty(Long id);

    List<PropertyEntity> findAllProperty();
}
