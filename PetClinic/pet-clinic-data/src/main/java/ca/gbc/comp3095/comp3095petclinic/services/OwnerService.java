package ca.gbc.comp3095.comp3095petclinic.services;

import ca.gbc.comp3095.comp3095petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
