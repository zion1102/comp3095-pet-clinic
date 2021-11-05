package ca.gbc.comp3095.comp3095petclinic.services;

import ca.gbc.comp3095.comp3095petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
