package com.example.demo.service.impl;


import com.example.demo.dto.ListPropertyResponse;
import com.example.demo.entidad.PropertyEntity;
import com.example.demo.repository.PropertyRepository;
import com.example.demo.service.IPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PropertyServiceimpl implements IPropertyService {

    private final PropertyRepository propertyRepository;

    @Autowired
    public PropertyServiceimpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public PropertyEntity createProperty(PropertyEntity property) {
        return null;
    }

    @Override
    public ListPropertyResponse getProperties(double minPrice, double maxPrice) {
        return null;
    }

    @Override
    public PropertyEntity UpdateProperty(PropertyEntity property) {
        return null;
    }

    @Override
    public void deleteProperty(Long id) {

    }

    @Override
    public void relentProperty(Long id) {

    }

    @Override
    public List<PropertyEntity> findAllProperty() {
        return List.of();
    }

    private void validateProperty(PropertyEntity property) {
        if (property.getNombre() == null || property.getNombre().trim().isEmpty() ||
                property.getUbicacion() == null || property.getUbicacion().trim().isEmpty() ||
                property.getPrecio() < 0
        )
            System.out.println("Falta un nombre en la propiedad");
    }

    private void  validateUniquemeName(String name) {
     PropertyEntity existingProperty = propertyRepository.findByName(name).orElse(null);
      if(existingProperty != null) {
          System.out.println("Casa ya existente");
      }
    }

    private void validationLocation(String location){
        List<String> allowedLocations = Arrays.asList("Medellin","Bogota","Cali","Cartagena");
        if(!allowedLocations.contains(location)){
            System.out.println("Ubicacion invalida" + location);
        }
    }
}
